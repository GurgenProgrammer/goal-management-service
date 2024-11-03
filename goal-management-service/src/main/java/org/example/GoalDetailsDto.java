package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoalDetailsDto {
    private String goal;
    private Integer remainingTime;

    @JsonProperty("user")
    private UserDetailsDto userDetailsDto;

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

    public UserDetailsDto getUserDetailsDto() {
        return userDetailsDto;
    }

    public void setUserDetailsDto(UserDetailsDto userDetailsDto) {
        this.userDetailsDto = userDetailsDto;
    }
}