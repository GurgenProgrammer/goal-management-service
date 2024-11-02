package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserDetailsDto createUser(@RequestBody CreateUserRequestDto requestDto) {
        CreateUserParams params = new CreateUserParams(requestDto.getId(),
                requestDto.getFirstname(), requestDto.getLastname(),
                requestDto.getUsername(), requestDto.getAge());
        User user = userService.saveUser(params);
        return userMapper.map(user);
    }
}
