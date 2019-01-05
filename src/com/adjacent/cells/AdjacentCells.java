package com.adjacent.cells;

import java.util.List;

/**
 * AdjacentCells class
 * <p>
 * Queue based implementation of Flood Fill Algorithm.
 */
public class AdjacentCells {

    /**
     * Number of Lines
     */
    private int numLines;
    /**
     * Number of Columns
     */
    private int numColumns;
    private int[][] matrix;

    AdjacentCells(int lines, int columns, int[][] matrix) {
        this.numLines = lines;
        this.numColumns = columns;
        this.matrix = matrix;
    }

    List<Coordinates> floodFill() {

        // execute floodFill
        FloodFill floodFill = new FloodFill();

        // return solution
        return floodFill.getSolution(matrix, 1, 0);
    }

    void printing() {
        for (int x = 0; x < this.numLines; x++) {
            for (int y = 0; y < this.numColumns; y++) {
                System.out.print(matrix[x][y] + ", ");
            }
            System.out.println();
        }
    }
}
