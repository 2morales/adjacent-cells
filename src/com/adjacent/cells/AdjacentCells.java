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

    void printing() {
        for (int x = 0; x < this.lines; x++) {
            for (int y = 0; y < this.columns; y++) {
                System.out.print(matrix[y][x] + ", ");
            }
            System.out.println();
        }
    }
}
