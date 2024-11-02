package org.example;

import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    public UserDetailsDto map(User user) {
        if (user == null) {
            return null;
        }
        UserDetailsDto dto = new UserDetailsDto();
        dto.setUsername(user.getUsername());
        dto.setFirstname(user.getFirstname());
        dto.setLastname(user.getLastname());
        dto.setAge(user.getAge());
        dto.setId(user.getId());
        return dto;
    }
}
