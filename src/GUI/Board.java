package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements ActionListener {

    private Grid grid = new Grid(this); // 10x22 grid
    private StartMenu startMenu = new StartMenu();

    int delay = 500;
    Timer timer = new Timer(delay, this);

    public Board() {
        timer.start();

    }

    public void paint(Graphics graphics) {
        fillBackground(graphics);
        drawOutline(graphics);

        grid.paint(graphics);
    }

    public void fillBackground(Graphics graphics) {
        graphics.setColor(Color.darkGray);
        graphics.fillRect(100, 100, 1000, 1400);
    }

    public void drawOutline(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.drawRect(100, 100, 1000, 1400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}