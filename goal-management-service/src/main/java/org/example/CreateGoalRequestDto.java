package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class CreateGoalRequestDto {
    @JsonProperty("goal")
    private String goal;

    @JsonProperty("remaining_time")
    private Integer remainingTime;

    @JsonProperty("user")
    private User user;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

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
