package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalService {
    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public List<Goal> getGoalsByUserId(Long userId) {
        return goalRepository.findByUserId(userId);
    }

    public Goal saveGoal(CreateGoalParams goalParams) {
        Goal goal = new Goal();
        goal.setGoal(goalParams.getGoal());
        goal.setRemainingTime(goalParams.getRemainingTime());
        goal.setUserId(goalParams.getUserId());
        return goalRepository.save(goal);
    }
}
