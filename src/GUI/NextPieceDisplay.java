package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NextPieceDisplay extends JPanel {

    private Piece[] nextPieces = new Piece[5];
    private Random random = new Random();
    private Piece nextPiece = nextPieces[0];

    private Grid grid;

    private int paintCounter = 0;

    public NextPieceDisplay(Grid grid) {
        this.grid = grid;
        initializePieces();
    }

    public Piece[] getNextPieces() {

        return this.nextPieces;
    }

    // cycles the next piece queue and returns next piece
    public Piece getNextPiece() {
        nextPieces[0] = nextPieces[1];
        nextPieces[1] = nextPieces[2];
        nextPieces[2] = nextPieces[3];
        nextPieces[3] = nextPieces[4];


        int buffer = random.nextInt(7);
        if (buffer == 0) {
            nextPieces[4] = new Piece("l", grid);
        } else if (buffer == 1) {
            nextPieces[4] = new Piece("j", grid);
        } else if (buffer == 2) {
            nextPieces[4] = new Piece("i", grid);
        } else if (buffer == 3) {
            nextPieces[4] = new Piece("o", grid);
        } else if (buffer == 4) {
            nextPieces[4] = new Piece("s", grid);
        } else if (buffer == 5) {
            nextPieces[4] = new Piece("t", grid);
        } else if (buffer == 6) {
            nextPieces[4] = new Piece("z", grid);
        }

        return nextPieces[0];
    }

    public void paint(Graphics graphics) {
        drawBackground(graphics);
        fillPieceColor(graphics);
        drawLines(graphics);
        drawDisplayOutline(graphics);
        drawPieceOutlines(graphics);

    }

    public void drawPieceOutlines(Graphics graphics) {
        graphics.setColor(Color.white);
        if (nextPieces[0].getPieceType().equals("l")) {
            graphics.drawLine(250, 350, 250, 500);
            graphics.drawLine(250, 500, 350, 500);
            graphics.drawLine(350, 500, 350, 450);
            graphics.drawLine(350, 450, 300, 450);
            graphics.drawLine(300, 450, 300, 350);
            graphics.drawLine(300, 350, 250, 350);

        } else if (nextPieces[0].getPieceType().equals("j")) {
            graphics.drawLine(300, 350, 350, 350);
            graphics.drawLine(350, 350, 350, 500);
            graphics.drawLine(350, 500, 250, 500);
            graphics.drawLine(250, 500, 250, 450);
            graphics.drawLine(250, 450, 300, 450);
            graphics.drawLine(300, 450, 300, 350);
            ;

        } else if (nextPieces[0].getPieceType().equals("i")) {
            graphics.drawRect(250, 350, 50, 200);

        } else if (nextPieces[0].getPieceType().equals("o")) {
            graphics.drawRect(250, 400, 100, 100);

        } else if (nextPieces[0].getPieceType().equals("s")) {
            graphics.drawLine(250, 350, 300, 350);
            graphics.drawLine(300, 350, 300, 400);
            graphics.drawLine(300, 400, 350, 400);
            graphics.drawLine(350, 400, 350, 500);
            graphics.drawLine(350, 500, 300, 500);
            graphics.drawLine(300, 500, 300, 450);
            graphics.drawLine(300, 450, 250, 450);
            graphics.drawLine(250, 450, 250, 350);

        } else if (nextPieces[0].getPieceType().equals("t")) {
            graphics.drawLine(300, 350, 350, 350);
            graphics.drawLine(350, 350, 350, 500);
            graphics.drawLine(350, 500, 300, 500);
            graphics.drawLine(300, 500, 300, 450);
            graphics.drawLine(300, 450, 250, 450);
            graphics.drawLine(250, 450, 250, 400);
            graphics.drawLine(250, 400, 300, 400);
            graphics.drawLine(300, 400, 300, 350);

        } else if (nextPieces[0].getPieceType().equals("z")) {
            graphics.drawLine(300, 350, 350, 350);
            graphics.drawLine(350, 350, 350, 450);
            graphics.drawLine(350, 450, 300, 450);
            graphics.drawLine(300, 450, 300, 500);
            graphics.drawLine(300, 500, 250, 500);
            graphics.drawLine(250, 500, 250, 400);
            graphics.drawLine(250, 400, 300, 400);
            graphics.drawLine(300, 400, 300, 350);
        }
    }

    public void drawLines(Graphics graphics) {
        graphics.setColor(Color.darkGray);
        graphics.drawLine(250, 300, 250, 1000);
        graphics.drawLine(300, 300, 300, 600);
        graphics.drawLine(350, 300, 350, 600);

        graphics.drawLine(200, 350, 400, 350);
        graphics.drawLine(200, 400, 400, 400);
        graphics.drawLine(200, 450, 400, 450);
        graphics.drawLine(200, 500, 400, 500);
        graphics.drawLine(200, 550, 400, 550);
    }

    public void drawDisplayOutline(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.drawLine(200, 300, 400, 300);
        graphics.drawLine(400, 300, 400, 600);
        graphics.drawLine(400, 600, 250, 600);
        graphics.drawLine(250, 600, 250, 800);
        graphics.drawLine(250, 800, 200, 800);
        graphics.drawLine(200, 800, 200, 300);
    }

    public void drawBackground(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(200, 300, 200, 300);
        graphics.fillRect(200, 600, 50, 200);
    }

    public void fillPieceColor(Graphics graphics) {
        drawNextPiece(graphics);
        drawSecondPiece(graphics);
        drawThirdPiece(graphics);
        drawFourthPiece(graphics);
        drawFifthPiece(graphics);

    }

    public void drawNextPiece(Graphics graphics) {
        if (nextPieces[0].getPieceType().equals("l")) {
            graphics.setColor(Color.orange);
            graphics.fillRect(250, 350, 50, 150);
            graphics.fillRect(300, 450, 50, 50);

        } else if (nextPieces[0].getPieceType().equals("j")) {
            graphics.setColor(Color.blue);
            graphics.fillRect(300, 350, 50, 150);
            graphics.fillRect(250, 450, 50, 50);

        } else if (nextPieces[0].getPieceType().equals("i")) {
            graphics.setColor(Color.cyan);
            graphics.fillRect(250, 350, 50, 200);

        } else if (nextPieces[0].getPieceType().equals("o")) {
            graphics.setColor(Color.yellow);
            graphics.fillRect(250, 400, 100, 100);

        } else if (nextPieces[0].getPieceType().equals("z")) {
            graphics.setColor(Color.red);
            graphics.fillRect(250, 400, 50, 100);
            graphics.fillRect(300, 350, 50, 100);

        } else if (nextPieces[0].getPieceType().equals("t")) {
            graphics.setColor(Color.magenta);
            graphics.fillRect(300, 350, 50, 150);
            graphics.fillRect(250, 400, 50, 50);

        } else if (nextPieces[0].getPieceType().equals("s")) {
            graphics.setColor(Color.green);
            graphics.fillRect(250, 350, 50, 100);
            graphics.fillRect(300, 400, 50, 100);

        }
    }

    public void drawSecondPiece(Graphics graphics) {
        if (nextPieces[1].getPieceType().equals("l")) {
            graphics.setColor(Color.orange);
        } else if (nextPieces[1].getPieceType().equals("j")) {
            graphics.setColor(Color.blue);
        } else if (nextPieces[1].getPieceType().equals("i")) {
            graphics.setColor(Color.cyan);
        } else if (nextPieces[1].getPieceType().equals("o")) {
            graphics.setColor(Color.yellow);
        } else if (nextPieces[1].getPieceType().equals("s")) {
            graphics.setColor(Color.green);
        } else if (nextPieces[1].getPieceType().equals("t")) {
            graphics.setColor(Color.magenta);
        } else if (nextPieces[1].getPieceType().equals("z")) {
            graphics.setColor(Color.red);
        }
        graphics.fillRect(200, 600, 50, 50);
    }

    public void drawThirdPiece(Graphics graphics) {
        if (nextPieces[2].getPieceType().equals("l")) {
            graphics.setColor(Color.orange);
        } else if (nextPieces[2].getPieceType().equals("j")) {
            graphics.setColor(Color.blue);
        } else if (nextPieces[2].getPieceType().equals("i")) {
            graphics.setColor(Color.cyan);
        } else if (nextPieces[2].getPieceType().equals("o")) {
            graphics.setColor(Color.yellow);
        } else if (nextPieces[2].getPieceType().equals("s")) {
            graphics.setColor(Color.green);
        } else if (nextPieces[2].getPieceType().equals("t")) {
            graphics.setColor(Color.magenta);
        } else if (nextPieces[2].getPieceType().equals("z")) {
            graphics.setColor(Color.red);
        }
        graphics.fillRect(200, 650, 50, 50);
    }

    public void drawFourthPiece(Graphics graphics) {
        if (nextPieces[3].getPieceType().equals("l")) {
            graphics.setColor(Color.orange);
        } else if (nextPieces[3].getPieceType().equals("j")) {
            graphics.setColor(Color.blue);
        } else if (nextPieces[3].getPieceType().equals("i")) {
            graphics.setColor(Color.cyan);
        } else if (nextPieces[3].getPieceType().equals("o")) {
            graphics.setColor(Color.yellow);
        } else if (nextPieces[3].getPieceType().equals("s")) {
            graphics.setColor(Color.green);
        } else if (nextPieces[3].getPieceType().equals("t")) {
            graphics.setColor(Color.magenta);
        } else if (nextPieces[3].getPieceType().equals("z")) {
            graphics.setColor(Color.red);
        }
        graphics.fillRect(200, 700, 50, 50);
    }

    public void drawFifthPiece(Graphics graphics) {
        if (nextPieces[4].getPieceType().equals("l")) {
            graphics.setColor(Color.orange);
        } else if (nextPieces[4].getPieceType().equals("j")) {
            graphics.setColor(Color.blue);
        } else if (nextPieces[4].getPieceType().equals("i")) {
            graphics.setColor(Color.cyan);
        } else if (nextPieces[4].getPieceType().equals("o")) {
            graphics.setColor(Color.yellow);
        } else if (nextPieces[4].getPieceType().equals("s")) {
            graphics.setColor(Color.green);
        } else if (nextPieces[4].getPieceType().equals("t")) {
            graphics.setColor(Color.magenta);
        } else if (nextPieces[4].getPieceType().equals("z")) {
            graphics.setColor(Color.red);
        }
        graphics.fillRect(200, 750, 50, 50);
    }

    public void initializePieces() {
        for (int i = 0; i < nextPieces.length; i++) {
            int buffer = random.nextInt(7);

            if (buffer == 0) {
                nextPieces[i] = new Piece("l", grid);
            } else if (buffer == 1) {
                nextPieces[i] = new Piece("j", grid);
            } else if (buffer == 2) {
                nextPieces[i] = new Piece("i", grid);
            } else if (buffer == 3) {
                nextPieces[i] = new Piece("o", grid);
            } else if (buffer == 4) {
                nextPieces[i] = new Piece("s", grid);
            } else if (buffer == 5) {
                nextPieces[i] = new Piece("t", grid);
            } else if (buffer == 6) {
                nextPieces[i] = new Piece("z", grid);
            }
        }
    }
}
