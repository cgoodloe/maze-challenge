package com.challenge.maze.model;

/**
 * Contains location within a maze and a reference
 * to previous location
 */
public class Location {

    private final int row;
    private final int column;
    private Location parent;

    /**
     * Constructor
     *
     * @param row the location row
     * @param column the location column
     */
    public Location(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Constructor
     *
     * @param row the location row
     * @param column the location column
     * @param parent the parent location
     */
    public Location(final int row, final int column, final Location parent) {
        this.row = row;
        this.column = column;
        this.parent = parent;
    }

    /**
     * Create new location object from existing
     *
     * @param location existing location
     */
    public Location(final Location location) {
        this.row = location.row;
        this.column = location.column;
        this.parent = location.parent;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Location getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "Location{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
