package com.adjacent.cells;

import java.util.Scanner;

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
        gridReader.importGrid();

        // then output result
    }
}
