package com.adjacent.cells;

/**
 * Helper class to store values of X and Y coordinates
 * <p>
 * Queue based implementation of Flood Fill Algorithm.
 */
class Coordinates {

    /**
     * Coordinate X
     */
    private int x;

    /**
     * Coordinate Y
     */
    private int y;

    /**
     * Constructor
     *
     * @param x Coordinate X
     * @param y Coordinate Y
     */
    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }
}
