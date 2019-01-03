package com.adjacent.cells;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * name for 100x100 grid file
     */
    private final static String FILE_NAME = "./grid/100x100.json";

    private final static String NUM_EXTRACT_REG_EXP = "[^0,1]";

    private final static String SPACE_LESS = "";

    private final static String INPUT_LINE_SPLIT = ",";

    public static void main(String[] args) {

        try {

            // which one to choose
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            int lines = 100;
            int columns = 100;

            int[][] grid = new int[lines][columns];

            int j = 0;
            for (String line; (line = reader.readLine()) != null; ) {

                String inputLine = line.toLowerCase().replaceAll(NUM_EXTRACT_REG_EXP, SPACE_LESS);

                if (!inputLine.isEmpty()) {
                    List<String> numbersInLine = Arrays.asList(inputLine.split(INPUT_LINE_SPLIT));

                    if (numbersInLine.size() == 100) {
                        int i = 0;
                        for (String number : numbersInLine) {
                            grid[i][j] = Integer.parseInt(number);
                            i++;
                        }
                        j++;
                    }
                }
            }

            AdjacentCells adjacent = new AdjacentCells(lines, columns, grid);
            adjacent.printing();

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
