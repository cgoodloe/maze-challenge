package com.challenge.maze.service;

import com.challenge.maze.model.Location;
import com.challenge.maze.model.Maze;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Test MazeService
 */
public class MazeServiceTest {

    private MazeService service;

    @Before
    public void setup() {
        this.service = new MazeService();
    }

    @Test
    public void testSolveMaze1() {
        final String mazeString = this.getFileAsString("maze1.txt");
        final Maze maze = new Maze(mazeString);
        final List<Location> locationList = this.service.solve(maze);

        Assert.assertEquals(15, locationList.size());
    }

    @Test
    public void testSolveMaze2() {
        final String mazeString = this.getFileAsString("maze2.txt");
        final Maze maze = new Maze(mazeString);
        final List<Location> locationList = this.service.solve(maze);

        Assert.assertEquals(220, locationList.size());
    }


    @Test
    public void testSolveMaze3() {
        final String mazeString = this.getFileAsString("maze3.txt");
        final Maze maze = new Maze(mazeString);
        final List<Location> locationList = this.service.solve(maze);

        Assert.assertEquals(303, locationList.size());
    }

    private String getFileAsString(final String filename) {
        try {
            return new String(Files.readAllBytes(Paths.get(getClass().getClassLoader().getResource(filename).toURI())));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
