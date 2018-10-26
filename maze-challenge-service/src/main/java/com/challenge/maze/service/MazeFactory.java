package com.challenge.maze.service;

import com.challenge.maze.model.Location;
import com.challenge.maze.model.Maze;
import org.springframework.stereotype.Service;

@Service
public class MazeFactory {

    public MazeFactory() {
        //no-op
    }

    public String buildMazeString(final Maze maze) {
        String mazeGrid = "";

        for(int i = 0; i < maze.getRows(); i++) {
            String row = "";
            for (int j = 0; j < maze.getColumns(); j++) {
                row += maze.getValue(new Location(i , j));
            }
            mazeGrid += row + "\n";
        }

        return mazeGrid;
    }
}
