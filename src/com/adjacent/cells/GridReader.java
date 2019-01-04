package com.adjacent.cells;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class GridReader {

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
            default: // change this
                this.fileName = "100x100.json";
        }
    }

    public int[][] importGrid() {
        try {

            // which one to choose
            BufferedReader reader = new BufferedReader(new FileReader("./grid/" + fileName));

            int[][] grid = new int[this.lines][this.columns];

            int j = 0;
            for (String line; (line = reader.readLine()) != null; ) {

                String inputLine = line.toLowerCase().replaceAll(NUM_EXTRACT_REG_EXP, SPACE_LESS);

                if (!inputLine.isEmpty()) {
                    List<String> numbersInLine = Arrays.asList(inputLine.split(INPUT_LINE_SPLIT));

                    if (numbersInLine.size() == this.lines) {
                        int i = 0;
                        for (String number : numbersInLine) {
                            grid[i][j] = Integer.parseInt(number);
                            i++;
                        }
                        j++;
                    }
                }
            }

//            AdjacentCells adjacent = new AdjacentCells(lines, columns, grid);
  //          adjacent.printing();

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO error");
        }
        return null;
    }
}

