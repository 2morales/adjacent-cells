package com.adjacent.cells;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Default Parser for input grids
 */
class GridReader {

    private String fileName;

    private int lines;
    private int columns;

    private final static String NUM_EXTRACT_REG_EXP = "[^0,1]";

    private final static String SPACE_LESS = "";

    private final static String INPUT_LINE_SPLIT = ",";

    GridReader(int opt) {
        switch (opt) {
            case 1:
                this.fileName = "100x100.json";
                this.lines = 100;
                this.columns = 100;
                break;
            case 2:
                this.fileName = "1000x1000.json";
                this.lines = 1000;
                this.columns = 1000;
                break;
            case 3:
                this.fileName = "10000x10000.json";
                this.lines = 10000;
                this.columns = 10000;
                break;
            case 4:
                this.fileName = "20000x20000.json";
                this.lines = 20000;
                this.columns = 20000;
                break;
            default: // change this
                this.fileName = "100x100.json";
        }
    }

    int[][] importGrid() {
        int[][] grid = new int[this.lines][this.columns];
        try {

            // which one to choose
            BufferedReader reader = new BufferedReader(new FileReader("./grid/" + fileName));


            int j = 0;
            for (String line; (line = reader.readLine()) != null; ) {

                String inputLine = line.toLowerCase().replaceAll(NUM_EXTRACT_REG_EXP, SPACE_LESS);

                if (!inputLine.isEmpty()) {
                    List<String> numbersInLine = Arrays.asList(inputLine.split(INPUT_LINE_SPLIT));

                    if (numbersInLine.size() == this.lines) {
                        int i = 0;
                        for (String number : numbersInLine) {
                            grid[j][i] = Integer.parseInt(number);
                            i++;
                        }
                        j++;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO error");
        }
        return grid;
    }
}

