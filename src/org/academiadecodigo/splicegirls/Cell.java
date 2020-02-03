package org.academiadecodigo.splicegirls;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell{

    private Rectangle rectangle;
    private int col;
    private int row;
    private boolean painted;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        this.painted = false;
        rectangle = new Rectangle(Grid.PADDING + Grid.CELL_SIZE * col, Grid.PADDING + Grid.CELL_SIZE * row, Grid.CELL_SIZE, Grid.CELL_SIZE);
        rectangle.draw();
    }

    public void paint() {
        painted = true;
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
    }

    public void erase() {
        painted = false;
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isPainted() {
        return painted;
    }
}
