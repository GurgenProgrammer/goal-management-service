package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping
    public List<UserDetailsDto> getAllUsers() {
        List<User> list = userService.getAllUsers();
        return userMapper.mapList(list);
    }

    @GetMapping("/{id}")
    public UserDetailsDto getUserById(@PathVariable Long id) {
        Optional<User> userOptional = userService.getUserById(id);
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
        User user = userService.saveUser(params);
        return userMapper.mapUser(user);
    }
}
