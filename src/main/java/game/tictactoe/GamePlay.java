package game.tictactoe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePlay implements ActionListener {

    private JButton[] buttons;

    private boolean playerXTurn = true;
    private final String playerOWon = "Congratulate player O wins !!!";
    private final String playerXWon = "Congratulate player X wins !!!";
    public GamePlay(JButton[] buttons)
    {
        this.buttons = buttons;
    }

    private boolean checkWinner(JButton[] buttons)
    {
        for (int i = 0; i < 9; i += 3) {
            if (!buttons[i].getText().equals("") &&
                    buttons[i].getText().equals(buttons[i + 1].getText()) &&
                    buttons[i].getText().equals(buttons[i + 2].getText())) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (!buttons[i].getText().equals("") &&
                    buttons[i].getText().equals(buttons[i + 3].getText()) &&
                    buttons[i].getText().equals(buttons[i + 6].getText())) {
                return true;
            }
        }

        // Check diagonals
        if (!buttons[0].getText().equals("") &&
                buttons[0].getText().equals(buttons[4].getText()) &&
                buttons[0].getText().equals(buttons[8].getText())) {
            return true;
        }
        if (!buttons[2].getText().equals("") &&
                buttons[2].getText().equals(buttons[4].getText()) &&
                buttons[2].getText().equals(buttons[6].getText())) {
            return true;
        }

        // No winner found
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for (int i = 0; i < 9; ++i)
        {
            if (actionEvent.getSource() == buttons[i])
            {
                if (buttons[i].getText().isEmpty())
                {
                    buttons[i].setText(playerXTurn ? "X" : "O");
                    if(checkWinner(buttons)) {
                        System.out.println(playerXTurn ? playerXWon : playerOWon);
                        return ;
                    }
                    playerXTurn = !playerXTurn;
                }
            }

        }
    }
}
