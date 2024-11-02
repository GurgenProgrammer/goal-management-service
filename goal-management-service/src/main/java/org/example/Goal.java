package org.example;

public class Goal {
    private final String goal;
    private final int remainingTime;

    public Goal(String goal) {
        this.goal = goal;
        this.remainingTime = 6;
    }

    public String getGoal() {
        return this.goal;
    }

    public int getRemainingTime() {
        return this.remainingTime;
    }
}
