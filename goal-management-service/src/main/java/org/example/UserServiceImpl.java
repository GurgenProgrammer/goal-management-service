package org.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(CreateUserParams userParams) {
        User user = new User();
        user.setFirstname(userParams.getFirstname());
        user.setLastname(userParams.getLastname());
        user.setUsername(userParams.getUsername());
        user.setAge(userParams.getAge());
        return userRepository.save(user);
    }
}
