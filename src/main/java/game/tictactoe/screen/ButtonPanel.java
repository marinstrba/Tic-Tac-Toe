package game.tictactoe.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    public ButtonPanel()
    {
        this.setLayout(new GridLayout(3,3));
        this.setBackground(new Color(150,150,150));
    }

    public static void addButtons(JButton[] buttons, JPanel buttonPanel, ActionListener listener)
    {
        for (int i = 0; i < 9; ++i)
        {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(listener);

        }
    }

}
