package org.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalServiceImpl implements GoalService{
    private final GoalRepository goalRepository;

    public GoalServiceImpl(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Override
    public List<Goal> getGoalsByUserId(Long userId) {
        return goalRepository.findByUserId(userId);
    }

    @Override
    public Goal save(CreateGoalParams goalParams) {
        Goal goal = new Goal();
        goal.setGoal(goalParams.getGoal());
        goal.setRemainingTime(goalParams.getRemainingTime());
        goal.setUser(goalParams.getUser());
        goal.setCreatedTime(goalParams.getCreatedTime());
        return goalRepository.save(goal);
    }
}
