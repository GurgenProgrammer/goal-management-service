package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class GoalMapper {

    private final UserService userService;
    private final UserMapper userMapper;

    public GoalMapper(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    public GoalDetailsDto mapGoal(Goal goal) {
        GoalDetailsDto dto = new GoalDetailsDto();
        dto.setGoal(goal.getGoal());
        dto.setRemainingTime(goal.getRemainingTime());
        Optional<User> userOptional = userService.getUserById(goal.getUserId());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            dto.setUserDetailsDto(userMapper.mapUser(user));
        }
        return dto;
    }

    public List<GoalDetailsDto> mapList(List<Goal> goals) {
        List<GoalDetailsDto> dtoList = new ArrayList<>();
        for (Goal goal : goals) {
            dtoList.add(mapGoal(goal));
        }
        return dtoList;
    }
}
