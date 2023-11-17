package game.tictactoe;

import game.tictactoe.screen.ButtonPanel;
import game.tictactoe.screen.GameWindow;
import game.tictactoe.screen.Textfield;
import game.tictactoe.screen.TitlePanel;

import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {

        JButton[] buttons = new JButton[9];

        /*
        Instance of GameScreen, text field,
        Title panel and button panel;
         */
        GameWindow mainScreen = new GameWindow();
        Textfield textfield = new Textfield();
        TitlePanel titlePanel = new TitlePanel();
        ButtonPanel buttonPanel = new ButtonPanel();
        GamePlay gamePlay = new GamePlay(buttons);

        /*
        I add these instances to the screen and also add the buttons
         */
        titlePanel.add(textfield);
        mainScreen.add(titlePanel, BorderLayout.NORTH);
        ButtonPanel.addButtons(buttons, buttonPanel,gamePlay);
        mainScreen.add(buttonPanel);


    }

}
