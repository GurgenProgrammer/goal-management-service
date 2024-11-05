package org.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalServiceImpl implements GoalService {
    private final GoalRepository goalRepository;

    public GoalServiceImpl(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Override
    public List<Goal> getGoalsByUserId(Long userId) {
        return goalRepository.findByUserId(userId);
    }

    @Override
    public Goal getGoalById(Long goalId) {
        return goalRepository.findById(goalId).orElse(null);
    }

    @Override
    public Goal save(CreateGoalParams goalParams) {
        Goal goal = new Goal();
        goal.setGoal(goalParams.getGoal());
        goal.setRemainingTime(goalParams.getRemainingTime());
        goal.setUser(goalParams.getUser());
        goal.setCreatedTime(goalParams.getCreatedTime());
        goal.setGoalStatus(GoalStatus.APPROVED);
        return goalRepository.save(goal);
    }

    @Override
    public Goal updateStatus(Long goalId, GoalStatus status) {
        Goal goal = getGoalById(goalId);
        if (goal != null) {
            goal.setGoalStatus(status);
            return goalRepository.save(goal);
        }
        return null;
    }
}
