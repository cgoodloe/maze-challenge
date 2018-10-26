package com.challenge.maze.model;

public class Location {

    private final int row;
    private final int column;
    private Location parent;

    public Location(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    public Location(final int row, final int column, final Location parent) {
        this.row = row;
        this.column = column;
        this.parent = parent;
    }

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
