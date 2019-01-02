package com.adjacent.cells;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     * name for 100x100 grid file
     */
    private final static String FILE_NAME = "./grid/100x100.json";

    public static void main(String[] args) {

        try {

            // which one to choose
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            int lines = 100;
            int columns = 100;

            int[][] grid = new int[lines][columns];

            String inputLine = "";
            int j = 0;
            for (String line; (line = reader.readLine()) != null; ) {

                inputLine = line.toLowerCase().replaceAll("[^0,1]", "");

                List<String> numbersInLine = Arrays.asList(inputLine.split(","));

                if (numbersInLine.size() == 100) {
                    int i = 0;
                    for (String number : numbersInLine) {
                        grid[i][j] = Integer.parseInt(number);
                        i++;
                    }
                    j++;
                }
            }

            for (int x = 0; x < 100; x++) {
                for (int y = 0; y < 100; y++) {
                    System.out.print(grid[x][y] + ", ");
                }
                System.out.println();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("error readLine()");
        }
    }
}
