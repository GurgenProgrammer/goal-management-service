package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {
    private final GoalService goalService;
    private final GoalMapper goalMapper;

    @Autowired
    public GoalController(GoalService goalService, GoalMapper goalMapper) {
        this.goalService = goalService;
        this.goalMapper = goalMapper;
    }

    @GetMapping("/users/{userId}")
    public List<GoalDetailsDto> getGoalsByUserId(@PathVariable Long userId) {
        List<Goal> goalList = goalService.getGoalsByUserId(userId);
        return goalMapper.mapList(goalList);
    }

    @PostMapping
    public GoalDetailsDto createGoal(@RequestBody CreateGoalRequestDto requestDto) {
        CreateGoalParams params = new CreateGoalParams(requestDto.getGoal(), requestDto.getRemainingTime(),
                requestDto.getUserId());
        Goal goal = goalService.saveGoal(params);
        return goalMapper.mapGoal(goal);
    }
}