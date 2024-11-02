package org.example;

public class CreateGoalParams {
    private final String goal;
    private final Integer remainingTime;

    public CreateGoalParams(String goal, Integer remainingTime) {
        this.goal = goal;
        this.remainingTime = remainingTime;
    }

    public String getGoal() {
        return goal;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }
}
