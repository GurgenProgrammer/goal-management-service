package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    public User saveUser(CreateUserParams userParams) {
        User user = new User();
        user.setFirstname(userParams.getFirstname());
        user.setLastname(userParams.getLastname());
        user.setUsername(userParams.getUsername());
        user.setAge(userParams.getAge());
        return userRepository.save(user);
    }
}
