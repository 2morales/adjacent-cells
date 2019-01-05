package com.adjacent.cells;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Queue based Implementation of Flood Fill Algorithm
 */
public class FloodFill {

    private List<Coordinates> solution;

    FloodFill() {
        this.solution = new ArrayList<>();
    }

    List<Coordinates> getSolution(int[][] grid, int target, int replacement) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) continue;

                // algorithm call
                floodFill(grid, target, replacement, i, j);
            }
        }
        // returns the solution in the end
        System.out.println(grid.length);
        return this.solution;
    }

    private void floodFill(int[][] grid, int target, int replacement, int x, int y) {

        // target is equal to replacement, return
        if (target == replacement) {
            return;
        }

        // if grid/node value is not equal to target, return
        if (grid[x][y] != target) {
            return;
        }

        // empty Queue
        Queue<Coordinates> queue = new LinkedList<>();

        // add node to the end of queue
        queue.add(new Coordinates(x, y));

        // while queue is not empty
        while (!queue.isEmpty()) {
            Coordinates point = queue.remove();

            if (value(grid, point.getX() - 1, point.getY()) == target) {
                grid[point.getX() - 1][point.getY()] = replacement;
                solution.add(new Coordinates(point.getX() - 1, point.getY()));
                queue.add(new Coordinates(point.getX() - 1, point.getY()));
            }

            if (value(grid, point.getX() + 1, point.getY()) == target) {
                grid[point.getX() + 1][point.getY()] = replacement;
                solution.add(new Coordinates(point.getX() + 1, point.getY()));
                queue.add(new Coordinates(point.getX() + 1, point.getY()));
            }

            if (value(grid, point.getX(), point.getY() - 1) == target) {
                grid[point.getX()][point.getY() - 1] = replacement;
                solution.add(new Coordinates(point.getX(), point.getY() - 1));
                queue.add(new Coordinates(point.getX(), point.getY() - 1));
            }

            if (value(grid, point.getX(), point.getY() + 1) == target) {
                grid[point.getX()][point.getY() + 1] = replacement;
                solution.add(new Coordinates(point.getX(), point.getY() + 1));
                queue.add(new Coordinates(point.getX(), point.getY() + 1));
            }
        }
    }

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
