package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface GoalService {
    List<Goal> getGoalsByUserId(Long userId);
    Goal save(CreateGoalParams goalParams);
}
