package game.tictactoe.screen;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public GameWindow()
    {
        this.setSize(900,900);
        this.setResizable(false);
        this.setTitle("Tic-Tac-Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon(getClass().getResource("/images/img.png"));
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(141321));

        this.setVisible(true);
    }

}
