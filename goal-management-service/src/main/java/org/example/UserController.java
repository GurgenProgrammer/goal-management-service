package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userServiceImpl;
    private final UserMapper userMapper;

    public UserController(UserServiceImpl userServiceImpl, UserMapper userMapper) {
        this.userServiceImpl = userServiceImpl;
        this.userMapper = userMapper;
    }

    @GetMapping
    public List<UserDetailsDto> getAllUsers() {
        List<User> list = userServiceImpl.getAll();
        return userMapper.mapList(list);
    }

    @GetMapping("/{id}")
    public UserDetailsDto getUserById(@PathVariable Long id) {
        Optional<User> userOptional = userServiceImpl.getById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return userMapper.mapUser(user);
        }
        return null;
    }

    @PostMapping
    public UserDetailsDto createUser(@RequestBody CreateUserRequestDto requestDto) {
        CreateUserParams params = new CreateUserParams(
                requestDto.getFirstname(), requestDto.getLastname(),
                requestDto.getUsername(), requestDto.getAge());
        User user = userServiceImpl.save(params);
        return userMapper.mapUser(user);
    }
}
