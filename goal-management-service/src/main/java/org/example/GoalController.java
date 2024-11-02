package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {
    private final GoalService goalService;
    private final GoalMapper goalMapper;

    public GoalController(GoalService goalService, GoalMapper goalMapper) {
        this.goalService = goalService;
        this.goalMapper = goalMapper;
    }

    @GetMapping
    public List<GoalDetailsDto> getAllGoals() {
        List<Goal> list = goalService.getAllGoals();
        return goalMapper.mapList(list);
    }

    @PostMapping
    public GoalDetailsDto createGoal(@RequestBody CreateGoalRequestDto requestDto) {
        CreateGoalParams params = new CreateGoalParams(requestDto.getGoal(), requestDto.getRemainingTime());
        Goal goal = goalService.saveGoal(params);
        return goalMapper.mapGoal(goal);
    }
}