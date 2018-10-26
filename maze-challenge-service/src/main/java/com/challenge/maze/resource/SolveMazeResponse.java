package com.challenge.maze.resource;

public class SolveMazeResponse {
    private String maze;
    private String solvedMaze;
    private int steps;

    public String getMaze() {
        return maze;
    }

    public void setMaze(String maze) {
        this.maze = maze;
    }

    public String getSolvedMaze() {
        return solvedMaze;
    }

    public void setSolvedMaze(String solvedMaze) {
        this.solvedMaze = solvedMaze;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
