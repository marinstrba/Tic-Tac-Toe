package game.tictactoe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePlay implements ActionListener {

    private JButton[] buttons;
    public GamePlay(JButton[] buttons)
    {
        this.buttons = buttons;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < 9; ++i)
        {
            if (actionEvent.getSource() == buttons[i])
            {
                if (buttons[i].)
                System.out.println("YOU PRESSED THIS: " + i);
            }
        }
    }
}
