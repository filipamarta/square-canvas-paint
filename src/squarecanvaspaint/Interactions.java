package squarecanvaspaint;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Interactions implements KeyboardHandler {

    private Keyboard keyboard;
    private Cursor cursor;
    private Grid grid;

    public Interactions(Cursor cursor, Grid grid) {
        this.cursor = cursor;
        this.grid = grid;
        this.keyboard = new Keyboard(this);
        init();
    }

    public void init() {
        //Right
        KeyboardEvent keyRight = new KeyboardEvent();
        keyRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyRight);

        //Left
        KeyboardEvent keyLeft = new KeyboardEvent();
        keyLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyLeft);

        //Up
        KeyboardEvent keyUp = new KeyboardEvent();
        keyUp.setKey(KeyboardEvent.KEY_UP);
        keyUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyUp);

        //Down
        KeyboardEvent keyDown = new KeyboardEvent();
        keyDown.setKey(KeyboardEvent.KEY_DOWN);
        keyDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyDown);

        //Save
        KeyboardEvent keySave = new KeyboardEvent();
        keySave.setKey(KeyboardEvent.KEY_S);
        keySave.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keySave);

        //Erase
        KeyboardEvent keySpace = new KeyboardEvent();
        keySpace.setKey(KeyboardEvent.KEY_SPACE);
        keySpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keySpace);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                System.out.println("right");
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                System.out.println("left");
                break;
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                System.out.println("up");
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                System.out.println("down");
                break;
            case KeyboardEvent.KEY_SPACE:
                Cell cell = grid.getCell(cursor.getCol(), cursor.getRow());

                if (!cell.isPainted()) {
                    cell.paint();
                    System.out.println("paint");
                } else {
                    cell.erase();
                    System.out.println("erase");
                }
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
