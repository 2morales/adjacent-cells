package com.adjacent.cells;

import java.util.List;
import java.util.Set;

/**
 * AdjacentCells class
 * <p>
 * <p>
 * Cells are considered adjacent
 * if they both contain a 1 (one)
 * and are next to each other horizontally
 * or vertically (not diagonally).
 * <p>
 * <p>
 * Queue based implementation of Flood Fill Algorithm.
 */
class AdjacentCells {

    /**
     * Grid
     */
    private int[][] grid;

    AdjacentCells(int[][] grid) {
        this.grid = grid;
    }

    /**
     * Call to Flood Fill algorithm
     *
     * @param target      target color
     * @param replacement replacement color
     * @return List with Coordinates of Adjacent Cells
     */
    Set<List<Coordinates>> floodFill(int target, int replacement) {

        // execute floodFill
        FloodFill floodFill = new FloodFill();

        // return solution
        return floodFill.getSolution(grid, target, replacement);
    }
}
