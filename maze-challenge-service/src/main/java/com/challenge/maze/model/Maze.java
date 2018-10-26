package com.challenge.maze.model;

/**
 * Encapsulates maze and adds util functions to a given ASCII maze
 */
public class Maze {
    private static final char MAZE_ENTRY = 'A';
    private static final char MAZE_EXIT = 'B';
    private static final char MAZE_WALL = '#';
    private static final char MAZE_VISITED = '@';

    private char[][] mazeMap;
    private int rows;
    private int columns;

    private Location entry;
    private Location exit;

    /**
     * Constructor
     *
     * @param mazeMapString the maze
     */
    public Maze(final String mazeMapString) {
        this.initializeMaze(mazeMapString);
    }

    /**
     * Constructor
     *
     * @param maze the maze to copy
     */
    public Maze(final Maze maze) {
        this.mazeMap = this.copyArray(maze.mazeMap);
        this.rows = maze.rows;
        this.columns = maze.columns;
        this.entry = new Location(maze.entry);
        this.exit = new Location(maze.exit);
    }

    /**
     * Makes copy of an array
     *
     * @param originalArray
     * @return char[][]
     */
    private char[][] copyArray(final char[][] originalArray) {
        char[][] newArray = new char[originalArray.length][];
        for(int i = 0; i < originalArray.length; i++) {
            newArray[i] = new char[originalArray[i].length];
            for(int j = 0; j < originalArray[i].length; j++) {
                newArray[i][j] = originalArray[i][j];
            }
        }

        return newArray;
    }

    /**
     * Initializes encapsulated maze
     *
     * @param mazeMapString the ASCII maze
     */
    private void initializeMaze(String mazeMapString) {
        final String normalizedEolMazeMap = normalizeLineEndings(mazeMapString);
        final String[] mazeMapRows = normalizedEolMazeMap.split("\n");
        this.rows = mazeMapRows.length;
        this.columns = mazeMapRows[0].length();

        this.mazeMap = new char[this.rows][this.columns];
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++) {
                this.mazeMap[i][j] = mazeMapRows[i].charAt(j);

                if(this.mazeMap[i][j] == MAZE_ENTRY) {
                    this.entry = new Location(i, j);
                }

                if(this.mazeMap[i][j] == MAZE_EXIT) {
                    this.exit = new Location(i,j);
                }
            }
        }
    }

    /**
     * Normalizes line endings to only be unix based
     * ]
     * @param mazeMapString
     * @return String
     */
    private String normalizeLineEndings(final String mazeMapString) {
        return mazeMapString.replaceAll("\\r\\n", "\n")
                            .replaceAll("\\r", "\n");
    }

    /**
     * Set location in maze as visited
     *
     * @param location
     */
    public void setVisited(final Location location) {
        this.mazeMap[location.getRow()][location.getColumn()] = MAZE_VISITED;
    }

    /**
     * Check if location in maze is visited
     *
     * @param location
     * @return
     */
    public boolean isVisited(final Location location) {
        return this.mazeMap[location.getRow()][location.getColumn()] == MAZE_VISITED;
    }

    /**
     * Check if location in maze is a wall
     *
     * @param location
     * @return
     */
    public boolean isWall(final Location location) {
        return this.mazeMap[location.getRow()][location.getColumn()] == MAZE_WALL;
    }

    /**
     * Check if location in maze is the entry
     *
     * @param location
     * @return
     */
    public boolean isEntry(final Location location) {
        return this.mazeMap[location.getRow()][location.getColumn()] == MAZE_ENTRY;
    }

    /**
     * Check if location in maze is the exit
     *
     * @param location
     * @return
     */
    public boolean isExit(final Location location) {
        return this.mazeMap[location.getRow()][location.getColumn()] == MAZE_EXIT;
    }

    /**
     * Check if location in maze is within maze dimensions
     *
     * @param location
     * @return
     */
    public boolean isValidLocation(final Location location) {
        return location.getRow() >= 0 &&
                location.getRow() < this.rows &&
                location.getColumn() >= 0 &&
                location.getColumn() < this.columns;
    }

    public Location getEntry() {
        return entry;
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public char getValue(final Location location) {
        return this.mazeMap[location.getRow()][location.getColumn()];
    }

    @Override
    public String toString() {
        return "Maze{" +
                "mazeMap=\n" + this.mazeMap +
                "\n, rows=" + this.rows +
                ", columns=" + this.columns +
                ", entry=" + this.entry +
                ", exit=" + this.exit +
                '}';
    }
}
