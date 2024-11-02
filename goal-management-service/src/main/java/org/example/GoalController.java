package org.example;

import java.util.ArrayList;
import java.util.List;

public class GoalController {
    List<Goal> goalList;

    public GoalController() {
        this.goalList = new ArrayList<>();
    }

    public void addGoal(String goal) {
        this.goalList.add(new Goal(goal));
    }

    public void deleteGoals() {
        for (int i = 0; i < goalList.size(); i++) {
            if (goalList.get(i).getRemainingTime() == 0) {
                goalList.remove(i);
            }
        }
    }
}
