package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoalService {
    private final GoalRepository goalRepository;

    @Autowired
    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    public Optional<Goal> getUserById(Long id) {
        return goalRepository.findById(id);
    }

    public Goal saveGoal(CreateGoalParams goalParams) {
        Goal goal = new Goal();
        goal.setGoal(goalParams.getGoal());
        goal.setRemainingTime(goalParams.getRemainingTime());
        return goalRepository.save(goal);
    }
}