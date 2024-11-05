package org.example;

import java.util.List;

public interface GoalService {
    List<Goal> getGoalsByUserId(Long userId);
    Goal getGoalById(Long goalId);
    Goal save(CreateGoalParams goalParams);
    Goal updateStatus(Long goalId, GoalStatus status);
}
