package com.adjacent.cells;

import java.util.*;

/**
 * Queue based Implementation of Flood Fill Algorithm
 */
class FloodFill {

    /**
        some pointless comments
     */
    private String some_pointless_string;

    /**
     * Solution List
     */
    private Set<List<Coordinates>> solution;

    /**
     * Constructor
     */
    FloodFill() {
        this.solution = new HashSet<>();
    }

    /**
     * Finds all adjacent cells in a grid
     *
     * @param grid        grid
     * @param target      target color
     * @param replacement replacement color
     * @return adjacent cells found
     */
    Set<List<Coordinates>> getSolution(int[][] grid, int target, int replacement) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) continue;

                // algorithm call
                List<Coordinates> tmp = new ArrayList<>();
                floodFill(grid, target, replacement, i, j, tmp);

                if (tmp.size() > 1) {
                    solution.add(tmp);
                }
            }
        }
        return this.solution;
    }

    /**
     * https://en.wikipedia.org/wiki/Flood_fill
     * Queue based Implementation of Flood Fill Algorithm
     *
     * @param grid        grid
     * @param target      target color
     * @param replacement replacement color
     * @param x           Coordinate X
     * @param y           Coordinate Y
     */
    private void floodFill(int[][] grid, int target, int replacement, int x, int y, List<Coordinates> tmp) {

        // target is equal to replacement, return
        if (target == replacement) {
            return;
        }

        // if grid/node value is not equal to target, return
        if (grid[x][y] != target) {
            return;
        }

        // empty Queue init
        Queue<Coordinates> queue = new LinkedList<>();

        // add node to the end of queue
        queue.add(new Coordinates(x, y));

        // while queue is not empty
        while (!queue.isEmpty()) {

            // remove first element from queue
            Coordinates point = queue.remove();

            // checks West (X - 1) on a X,Y cartesian graph
            if (value(grid, point.getX() - 1, point.getY()) == target) {
                grid[point.getX() - 1][point.getY()] = replacement;
                tmp.add(new Coordinates(point.getX() - 1, point.getY()));
                queue.add(new Coordinates(point.getX() - 1, point.getY()));
            }

            // checks East (X + 1) on a X,Y cartesian graph
            if (value(grid, point.getX() + 1, point.getY()) == target) {
                grid[point.getX() + 1][point.getY()] = replacement;
                tmp.add(new Coordinates(point.getX() + 1, point.getY()));
                queue.add(new Coordinates(point.getX() + 1, point.getY()));
            }

            // checks North (Y - 1) on a X,Y cartesian graph
            if (value(grid, point.getX(), point.getY() - 1) == target) {
                grid[point.getX()][point.getY() - 1] = replacement;
                tmp.add(new Coordinates(point.getX(), point.getY() - 1));
                queue.add(new Coordinates(point.getX(), point.getY() - 1));
            }

            // checks South (y + 1) on a X,Y cartesian graph
            if (value(grid, point.getX(), point.getY() + 1) == target) {
                grid[point.getX()][point.getY() + 1] = replacement;
                tmp.add(new Coordinates(point.getX(), point.getY() + 1));
                queue.add(new Coordinates(point.getX(), point.getY() + 1));
            }
        }
    }

    /**
     * Checks if position on X and Y coordinates is valid
     *
     * @param grid grid
     * @param x    Coordinate X
     * @param y    Coordinate Y
     * @return -1 if it isn't valid or value at position if it is valid
     */
    private int value(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length) {
            return -1;
        } else if (y < 0 || y >= grid[0].length) {
            return -1;
        } else {
            return grid[x][y];
        }
    }
}
