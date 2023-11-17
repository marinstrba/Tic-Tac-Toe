package game.tictactoe.screen;

import javax.swing.*;
import java.awt.*;

public class Textfield extends JLabel {

    public Textfield()
    {
        this.setBackground(new Color(25,25,25));
        this.setForeground(new Color(100,100,100));
        this.setFont(new Font("Ink Free", Font.BOLD,75));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setText("TIC-TAC-TOE");
        this.setOpaque(true);

    }

}
