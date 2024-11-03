package org.example;

public class CreateGoalParams {
    private final String goal;
    private final Integer remainingTime;
    private final Long userId;

    public CreateGoalParams(String goal, Integer remainingTime, Long userId) {
        this.goal = goal;
        this.remainingTime = remainingTime;
        this.userId = userId;
    }

    public String getGoal() {
        return goal;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }

    public Long getUserId() {
        return userId;
    }
}
