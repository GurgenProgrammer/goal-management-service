package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;

public class GoalDetailsDto {
    private String goal;
    private Integer remainingTime;

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(Integer remainingTime) {
        this.remainingTime = remainingTime;
    }

}
