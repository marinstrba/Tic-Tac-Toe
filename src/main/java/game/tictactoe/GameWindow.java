package game.tictactoe;

import javax.swing.JFrame;
import  javax.swing.ImageIcon;
import java.awt.*;

public class GameWindow extends JFrame {
    public GameWindow()
    {
        this.setVisible(true);

        this.setSize(900,900);
        this.setResizable(false);
        this.setTitle("Tic-Tac-Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon(getClass().getResource("/images/img.png"));
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(Color.BLACK);
    }

}
