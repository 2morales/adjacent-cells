package com.adjacent.cells;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        // choose which grid
        Scanner scanner = new Scanner(System.in);
        System.out.println("possible grid sizes:");
        System.out.println("\t1 - 100x100");
        System.out.println("\t2 - 1000x1000");
        System.out.println("\t3 - 10000x10000");
        System.out.println("\t4 - 20000x20000");
        System.out.print("choose grid size: ");

        int opt = scanner.nextInt();

        // please specify
        while (opt < 1 || opt > 4) {
            System.out.print("please specify: ");
            opt = scanner.nextInt();
        }
        scanner.close();

        // read, import, parse grid
        GridReader gridReader = new GridReader(opt);
        int[][] grid = gridReader.importGrid();

        int[][] testGrid = new int[][]{
                {0, 0, 0, 1, 0, 0, 1, 1},
                {0, 0, 1, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 1, 1},
                {0, 0, 0, 1, 0, 0, 1, 1}
        };

        // then output result
        AdjacentCells adjacentCells = new AdjacentCells(testGrid);

        // 1 = target, 0 = replacement
        final int target = 1;
        final int replacement = 0;

        // output
        Set<List<Coordinates>> pointsGroup = adjacentCells.floodFill(target, replacement);
        for (List<Coordinates> pointsList : pointsGroup) {
            System.out.print("[ ");

            int i = 0;
            for (Coordinates coordinates : pointsList) {
                System.out.print("[" + coordinates.getX() + ", " + coordinates.getY() + "]");

                if (++i != pointsList.size()) System.out.print(", ");
            }
            System.out.println(" ]");
        }
    }
}
