# Adjacent Cells Challenge	

> Using any programming language, create a program that is capable of identifying all the groups of adjacent cells in a grid.

> The grid consists of a 2-dimensional array of 0 (zeroes) and 1 (ones). The output of the program should consist of a sequence of multi-dimensional arrays each containing the list of points that make up a group of adjacent cells.

**Rules**:
> * Cells are considered adjacent if they both contain a 1 (one) and are next to each other horizontally or vertically (not diagonally).
> * Groups containing a single cell should not be considered
> * The order of points or groups outputted by the program is not relevant

## Tests

For testing, you can change the name of the grid to use when finding the points.

To do so: 

    1. Go to Main.java file and change parameter on line 42 from 'grid' to 'TEST_GRID'.
    2. Then, compare the outputted result with the one on the given document.

Unit tests will be made in order to automate this process and avoid hard-coded inputs/declarations.

## Built With

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDE

## Acknowledgments

* Queue based Implementation of Flood Fill Algorithm
