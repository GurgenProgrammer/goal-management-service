package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateGoalRequestDto {
    @JsonProperty("goal")
    private String goal;

    @JsonProperty("remaining_time")
    private Integer remainingTime;

    @JsonProperty("user_id")
    private Long userId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}