package com.adjacent.cells;

/**
 * Helper class to store values of X and Y coordinates
 * <p>
 * Queue based implementation of Flood Fill Algorithm.
 */
public class Coordinates {

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
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Coordinates coordinates = (Coordinates) obj;

        return coordinates.getX() == ((Coordinates) obj).getX()
                && coordinates.getY() == ((Coordinates) obj).getY();
    }
}
