package org.example;

import org.hibernate.usertype.UserType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GoalMapper {

    private final UserMapper map;

    public GoalMapper(UserMapper userMapper) {
        this.map = userMapper;
    }

    public GoalDetailsDto map(Goal goal) {
        GoalDetailsDto dto = new GoalDetailsDto();
        dto.setGoal(goal.getGoal());
        dto.setRemainingTime(goal.getRemainingTime());
        dto.setUserDetailsDto(map.mapUser(goal.getUser()));
        dto.setCreatedTime(goal.getCreatedTime());
        return dto;
    }

    public List<GoalDetailsDto> mapList(List<Goal> goals) {
        List<GoalDetailsDto> dtoList = new ArrayList<>();
        for (Goal goal : goals) {
            dtoList.add(map(goal));
        }
        return dtoList;
    }
}
