package com.adjacent.cells;

import java.util.List;

public class AdjacentCells {

    private int lines;
    private int columns;
    private int[][] matrix;
    private List<String> adjacentCells;

    AdjacentCells(int lines, int columns, int[][] matrix) {
        this.lines = lines;
        this.columns = columns;
        this.matrix = matrix;
    }

    List<String> findAdjacentCells() {
        for (int x = 0; x < this.lines; x++) {
            for (int y = 0; y < this.columns; y++) {
                //System.out.print(matrix[y][x] + ", ");
                if (validPosition(x, y)) {
                    System.out.println(matrix[x][y]);
                }
            }
        }


        return null;
    }

    /**
     * Checks if (x,y) position is valid
     *
     * @param x lines
     * @param y columns
     * @return true if valid
     */
    private boolean validPosition(int x, int y) {
        return (x >= 0
                && x < columns
                && y >= 0
                && y < lines);
    }

    boolean validUp(int x, int y) {


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

    void printing() {
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                System.out.print(matrix[y][x] + ", ");
            }
            System.out.println();
        }
    }
}
