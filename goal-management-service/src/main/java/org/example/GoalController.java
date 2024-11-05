package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {
    private final GoalServiceImpl goalServiceImpl;
    private final GoalMapper goalMapper;

    @Autowired
    public GoalController(GoalServiceImpl goalServiceImpl, GoalMapper goalMapper) {
        this.goalServiceImpl = goalServiceImpl;
        this.goalMapper = goalMapper;
    }

    @PutMapping("/change_status/{goalId}/{status}")
    public GoalDetailsDto changeGoalStatus(@PathVariable("goalId") Long goalId, @PathVariable("status") GoalStatus status) {
        return goalMapper.map(goalServiceImpl.updateStatus(goalId, status));
    }


    @GetMapping("/users/{userId}")
    public List<GoalDetailsDto> getGoalsByUserId(@PathVariable("userId") Long userId) {
        List<Goal> goalList = goalServiceImpl.getGoalsByUserId(userId);
        return goalMapper.mapList(goalList);
    }

    @PostMapping
    public GoalDetailsDto create(@RequestBody CreateGoalRequestDto requestDto) {
        CreateGoalParams params = new CreateGoalParams(
                requestDto.getGoal(),
                requestDto.getRemainingTime(),
                requestDto.getUser(),
                LocalDateTime.now()
        );
        Goal goal = goalServiceImpl.save(params);
        return goalMapper.map(goal);
    }
}
