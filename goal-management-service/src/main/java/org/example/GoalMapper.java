package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GoalMapper {
    public GoalDetailsDto mapGoal(Goal goal) {
        GoalDetailsDto dto = new GoalDetailsDto();
        dto.setGoal(goal.getGoal());
        dto.setRemainingTime(goal.getRemainingTime());
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