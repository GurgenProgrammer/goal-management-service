package org.example;

import jakarta.persistence.*;

@Table(name = "goals")
@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "goal", nullable = false)
    private String goal;

    @Column(name = "remaining_time", nullable = false)
    private Integer remainingTime;

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setRemainingTime(Integer remainingTime) {
        this.remainingTime = remainingTime;
    }

    public String getGoal() {
        return this.goal;
    }

    public Integer getRemainingTime() {
        return this.remainingTime;
    }
}
