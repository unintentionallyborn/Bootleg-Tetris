import GUI.Board;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bootleg Tetris");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLACK);
        frame.setResizable(true);
        frame.setBounds(500, 50, 1225, 1700);

        Board gameboard = new Board();
        frame.add(gameboard);

        frame.setVisible(true);
    }
}
