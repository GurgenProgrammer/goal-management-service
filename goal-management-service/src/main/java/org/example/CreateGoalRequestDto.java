package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateGoalRequestDto {
    @JsonProperty("goal")
    private String goal;

    @JsonProperty("remaining_time")
    private Integer remainingTime;

    public String getGoal() {
        return goal;
    }

    public Integer getRemainingTime() {
        return remainingTime;
    }
}