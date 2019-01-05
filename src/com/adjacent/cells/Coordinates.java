package com.adjacent.cells;

/**
 * Helper class to store values of X and Y coordinates
 */
public class Coordinates {

    private int x;
    private int y;

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
