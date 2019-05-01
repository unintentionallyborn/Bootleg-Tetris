package GUI;

import GUI.Grid;

import java.awt.*;

public class Piece {

    private boolean isLPiece = false;
    private boolean isJPiece = false;
    private boolean isIPiece = false;
    private boolean isOPiece = false;
    private boolean isSPiece = false;
    private boolean isTPiece = false;
    private boolean isZPiece = false;

    private int[] xCoors = new int[4];
    private int[] yCoors = new int[4];

    private Grid grid;

    public Piece(String pieceType, Grid grid) {
        this.grid = grid;

        if (pieceType.equals("l")) {
            isLPiece = true;
        } else if (pieceType.equals("j")) {
            isJPiece = true;
        } else if (pieceType.equals("i")) {
            isIPiece = true;
        } else if (pieceType.equals("o")) {
            isOPiece = true;
        } else if (pieceType.equals("s")) {
            isSPiece = true;
        } else if (pieceType.equals("t")) {
            isTPiece = true;
        } else if (pieceType.equals("z")) {
            isZPiece = true;
        }

        setInitialCoords();
    }

    public void setInitialCoords() {
        if (getPieceType().equals("j")) {
            setxCoors(750, 750, 750, 700);
            setyCoors(300, 350, 400, 400);

        } else if (getPieceType().equals("l")) {
            setxCoors(700, 700, 700, 750);
            setyCoors(300, 350, 400, 400);

        } else if (getPieceType().equals("i")) {
            setxCoors(700, 700, 700, 700);
            setyCoors(300, 350, 400, 450);

        } else if (getPieceType().equals("o")) {
            setxCoors(700, 700, 750, 750);
            setyCoors(300, 350, 350, 300);

        } else if (getPieceType().equals("s")) {
            setxCoors(700, 750, 750, 800);
            setyCoors(350, 350, 300, 300);

        } else if (getPieceType().equals("t")) {
            setxCoors(750, 700, 750, 800);
            setyCoors(300, 350, 350, 350);

        } else if (getPieceType().equals("z")) {
            setxCoors(650, 700, 700, 750);
            setyCoors(300, 300, 350, 350);
        }
    }

    public void setxCoors(int firstX, int secondX, int thirdX, int fourthX) {
        xCoors[0] = firstX;
        xCoors[1] = secondX;
        xCoors[2] = thirdX;
        xCoors[3] = fourthX;
    }

    public void setyCoors(int firstY, int secondY, int thirdY, int fourthY) {
        yCoors[0] = firstY;
        yCoors[1] = secondY;
        yCoors[2] = thirdY;
        yCoors[3] = fourthY;
    }

    public int[] getxCoors() {
        return this.xCoors;
    }

    public int[] getyCoors() {
        return this.yCoors;
    }

    public String getPieceType() {
        if (isLPiece) {
            return "l";
        } else if (isJPiece) {
            return "j";
        } else if (isIPiece) {
            return "i";
        } else if (isOPiece) {
            return "o";
        } else if (isSPiece) {
            return "s";
        } else if (isTPiece) {
            return "t";
        } else if (isZPiece) {
            return "z";
        }

        return null;
    }

    public void draw(Graphics graphics) {
        if (isLPiece) {
            graphics.setColor(Color.orange);

        } else if (isJPiece) {
            graphics.setColor(Color.blue);

        } else if (isIPiece) {
            graphics.setColor(Color.cyan);

        } else if (isOPiece) {
            graphics.setColor(Color.yellow);

        } else if (isZPiece) {
            graphics.setColor(Color.red);

        } else if (isTPiece) {
            graphics.setColor(Color.magenta);

        } else if (isSPiece) {
            graphics.setColor(Color.green);

        }

        graphics.fillRect(xCoors[0], yCoors[0], 50, 50);
        graphics.fillRect(xCoors[1], yCoors[1], 50, 50);
        graphics.fillRect(xCoors[2], yCoors[2], 50, 50);
        graphics.fillRect(xCoors[3], yCoors[3], 50, 50);
    }

    public void fall() {
        for (int i = 0; i < yCoors.length; i++) {
            yCoors[i] += 50;
        }
    }

    public void moveRight() {
        for (int i = 0; i < xCoors.length; i++) {
            xCoors[i] += 50;
        }
    }

    public void moveLeft() {
        for (int i = 0; i < xCoors.length; i++) {
            xCoors[i] -= 50;
        }
    }
}
