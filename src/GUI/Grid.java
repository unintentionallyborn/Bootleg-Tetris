package GUI;

import Domain.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Grid GUI contains the NextPieceDisplay GUI

public class Grid extends JPanel implements KeyListener {

    private NextPieceDisplay nextPieceDisplay = new NextPieceDisplay(this);
    private Piece livePiece = nextPieceDisplay.getNextPiece();

    public Grid(Board board) {
        setFocusable(true);
        addKeyListener(this);
        this.grabFocus();

        nextPieceDisplay.initializePieces();
    }

    public void paint(Graphics graphics) {

        drawBackground(graphics);

        livePiece.draw(graphics);

        drawGridLines(graphics);
        drawGridOutline(graphics);

        nextPieceDisplay.drawBackground(graphics);
        nextPieceDisplay.fillPieceColor(graphics);
        nextPieceDisplay.drawLines(graphics);
        nextPieceDisplay.drawPieceOutlines(graphics);
        nextPieceDisplay.drawDisplayOutline(graphics);

//        if (paintCounter == 0) {
//            nextPieceDisplay.initializePieces();
//        }

        livePiece.fall();

//        if(livePieceIsSet()) {
//            livePiece = nextPieceDisplay.getNextPiece();
//        }

//        drawBackground(graphics);
//        drawDeadPieces(graphics);
//        drawLivePiece(graphics);
//        drawGridLines(graphics);
//        drawGridOutline(graphics);
//        drawDeadPieceOutlines(graphics);
//        drawLivePieceOutlines(graphics);

        graphics.dispose();
    }

    public void drawBackground(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(500, 300, 500, 1100);
    }

    public void drawGridOutline(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.drawRect(500, 300, 500, 1100);
    }

    public void drawGridLines(Graphics graphics) {
        // draws horizontal lines
        graphics.setColor(Color.darkGray);
        graphics.drawLine(500, 400, 1000, 400);
        graphics.drawLine(500, 500, 1000, 500);
        graphics.drawLine(500, 600, 1000, 600);
        graphics.drawLine(500, 700, 1000, 700);
        graphics.drawLine(500, 800, 1000, 800);
        graphics.drawLine(500, 900, 1000, 900);
        graphics.drawLine(500, 1000, 1000, 1000);
        graphics.drawLine(500, 1100, 1000, 1100);
        graphics.drawLine(500, 1200, 1000, 1200);
        graphics.drawLine(500, 1300, 1000, 1300);
        graphics.drawLine(500, 350, 1000, 350);
        graphics.drawLine(500, 450, 1000, 450);
        graphics.drawLine(500, 550, 1000, 550);
        graphics.drawLine(500, 650, 1000, 650);
        graphics.drawLine(500, 750, 1000, 750);
        graphics.drawLine(500, 850, 1000, 850);
        graphics.drawLine(500, 950, 1000, 950);
        graphics.drawLine(500, 1050, 1000, 1050);
        graphics.drawLine(500, 1150, 1000, 1150);
        graphics.drawLine(500, 1250, 1000, 1250);
        graphics.drawLine(500, 1350, 1000, 1350);

        // draws vertical lines
        graphics.drawLine(600, 300, 600, 1400);
        graphics.drawLine(700, 300, 700, 1400);
        graphics.drawLine(800, 300, 800, 1400);
        graphics.drawLine(900, 300, 900, 1400);
        graphics.drawLine(550, 300, 550, 1400);
        graphics.drawLine(650, 300, 650, 1400);
        graphics.drawLine(750, 300, 750, 1400);
        graphics.drawLine(850, 300, 850, 1400);
        graphics.drawLine(950, 300, 950, 1400);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            livePiece.moveLeft();
            repaint();

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            livePiece.moveRight();
            repaint();

//        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
//
//        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//
//        } else if (e.getKeyCode() == KeyEvent.VK_Z) {
//
//        } else if (e.getKeyCode() == KeyEvent.VK_X) {
//
//        } else if (e.getKeyCode() == KeyEvent.VK_C) {
//
//        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//
//        }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
