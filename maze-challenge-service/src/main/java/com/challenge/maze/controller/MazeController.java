package com.challenge.maze.controller;

import com.challenge.maze.service.MazeFactory;
import com.challenge.maze.model.Location;
import com.challenge.maze.model.Maze;
import com.challenge.maze.resource.SolveMazeResponse;
import com.challenge.maze.service.MazeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for accessing maze service
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MazeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MazeController.class);

    final MazeService mazeService;
    final MazeFactory mazeFactory;

    /**
     * Constructor
     *
     * @param mazeService the MazeService
     * @param mazeFactory the MazeFactory
     */
    @Autowired
    public MazeController(final MazeService mazeService, final MazeFactory mazeFactory) {
        this.mazeService = mazeService;
        this.mazeFactory = mazeFactory;
    }

    /**
     * Processes submitted maze and solves it.
     *
     * @param mazeRequest the maze to solve
     * @return SolveMazeResponse
     */
    @RequestMapping(method = RequestMethod.POST, path = "/maze/solve")
    public SolveMazeResponse solveMaze(@RequestBody final String mazeRequest) {
        LOGGER.info("Request:\n{}", mazeRequest);

        final Maze maze = new Maze(mazeRequest);
        List<Location> path = this.mazeService.solve(maze);

        this.mazeService.applyPath(maze, path);

        final SolveMazeResponse response = new SolveMazeResponse();
        response.setMaze(mazeRequest);
        response.setSolvedMaze(this.mazeFactory.buildMazeString(maze));
        response.setSteps(path.size());

        return response;
    }
}
