package org.example;

import java.time.LocalDateTime;

public class CreateGoalParams {
    private final String goal;
    private final Integer remainingTime;
    private final User user;
    private final LocalDateTime createdAt;

    public CreateGoalParams(String goal, Integer remainingTime, User user, LocalDateTime createdAt) {
        this.goal = goal;
        this.remainingTime = remainingTime;
        this.user = user;
        this.createdAt = createdAt;
    }

    public String getGoal() {
        return goal;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getCreatedTime() {
        return createdAt;
    }
}
