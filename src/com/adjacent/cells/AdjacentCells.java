package com.adjacent.cells;

public class AdjacentCells {

    private int lines;
    private int columns;
    private int[][] matrix;

    AdjacentCells(int lines, int columns, int[][] matrix) {
        this.lines = lines;
        this.columns = columns;
        this.matrix = matrix;
    }

    /**
     * Checks if (x,y) position is valid
     *
     * @param x lines
     * @param y columns
     * @return true if valid
     */
    boolean validPosition(int x, int y) {
        return (x >= 0
                && x < columns
                && y >= 0
                && y < lines);
    }

    boolean validUp() {
        return true;
    }

    boolean validDown() {
        return true;
    }

    boolean validLeft() {
        return true;
    }

    boolean validRight() {
        return true;
    }
}
