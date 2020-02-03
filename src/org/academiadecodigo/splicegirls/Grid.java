package org.academiadecodigo.splicegirls;

public class Grid {

    public final static int CELL_SIZE = 20;
    public final static int PADDING = 10;

    private int cols;
    private int rows;

    private Cell[][] cells;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.cells = new Cell[cols][rows];

        setupGrid();
    }

    public void setupGrid(){
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                cells[col][row] = new Cell(col,row);
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public Cell getCell(int col, int row) {
        return cells[col][row];
    }
}
