package org.academiadecodigo.splicegirls;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    private Rectangle rectangle;
    private int col;
    private int row;

    public Cursor() {
        this.col = 0;
        this.row = 0;
        this.rectangle = new Rectangle(Grid.PADDING + Grid.CELL_SIZE * col, Grid.PADDING + Grid.CELL_SIZE * row, Grid.CELL_SIZE, Grid.CELL_SIZE);
        rectangle.setColor(Color.GREEN);
        rectangle.fill();
    }

    public void moveRight() {
        col++;
        rectangle.translate(Grid.CELL_SIZE, 0);
    }

    public void moveLeft() {
        col--;
        rectangle.translate(-Grid.CELL_SIZE, 0);
    }

    public void moveUp() {
        row--;
        rectangle.translate(0, -Grid.CELL_SIZE);
    }

    public void moveDown() {
        row++;
        rectangle.translate(0, Grid.CELL_SIZE);
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
