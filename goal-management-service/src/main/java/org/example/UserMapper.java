package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {
    public UserDetailsDto mapUser(User user) {
        UserDetailsDto dto = new UserDetailsDto();
        dto.setUsername(user.getUsername());
        dto.setFirstname(user.getFirstname());
        dto.setLastname(user.getLastname());
        dto.setAge(user.getAge());
        dto.setId(user.getId());
        return dto;
    }

    public List<UserDetailsDto> mapList(List<User> users) {
        List<UserDetailsDto> dtoList = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            dtoList.add(mapUser(users.get(i)));
        }
        return dtoList;
    }
}
