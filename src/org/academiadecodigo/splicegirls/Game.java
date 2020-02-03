package org.academiadecodigo.splicegirls;

public class Game  {

    private Cursor cursor;
    private Grid grid;
    private Interactions interactions;
    private Cell cell;
    private int cols;
    private int rows;

    public Game(int cols, int rows){
        this.cols = cols;
        this.rows = rows;

        this.grid = new Grid(cols, rows);
        this.cursor = new Cursor();

        this.interactions = new Interactions(cursor, grid);
    }
}
