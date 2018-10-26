package com.challenge.maze.service;

import com.challenge.maze.model.Location;
import com.challenge.maze.model.Maze;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Provides methods to interact with Maze
 */
@Service
public class MazeService {

    public MazeService() {
        //no-op
    }

    /**
     * Finds the shortest path from entry to exit
     *
     * @param maze the maze to solve
     * @return List<Location> the
     */
    public List<Location> solve(final Maze maze) {
        final Maze mazeCopy = new Maze(maze);

        LinkedList<Location> nextToVisit = new LinkedList<>();
        Location start = mazeCopy.getEntry();
        nextToVisit.add(start);

        while (!nextToVisit.isEmpty()) {
            Location currentLocation = nextToVisit.remove();

            if (!mazeCopy.isValidLocation(currentLocation) || mazeCopy.isVisited(currentLocation) || mazeCopy.isWall(currentLocation)) {
                continue;
            }

            if (mazeCopy.isExit(currentLocation)) {
                return getPath(currentLocation);
            }

            nextToVisit.add(new Location(currentLocation.getRow(), currentLocation.getColumn() + 1, currentLocation));
            nextToVisit.add(new Location(currentLocation.getRow() + 1, currentLocation.getColumn(), currentLocation));
            nextToVisit.add(new Location(currentLocation.getRow(), currentLocation.getColumn() - 1, currentLocation));
            nextToVisit.add(new Location(currentLocation.getRow() - 1, currentLocation.getColumn(), currentLocation));

            mazeCopy.setVisited(currentLocation);

        }
        return Collections.emptyList();
    }

    /**
     * Routes a path through the given maze
     *
     * @param maze the maze to apply the path to
     * @param path the path
     * @return Maze
     */
    public Maze applyPath(final Maze maze, final List<Location> path) {
        for(Location location : path) {
            if(!maze.isEntry(location) && !maze.isExit(location)) {
                maze.setVisited(location);
            }
        }

        return maze;
    }

    /**
     * Gets path in entry to exit order
     *
     * @param finalLocation the final location of the path
     * @return List<Location> the path
     */
    private List<Location> getPath(final Location finalLocation) {
        List<Location> path = new ArrayList<>();
        Location currentLocation = finalLocation;

        while (currentLocation != null) {
            path.add(currentLocation);
            currentLocation = currentLocation.getParent();
        }

        Collections.reverse(path);

        return path;
    }
}
