package org.example;

import org.example.pages.GuessingPanel;
import org.example.pages.StartPanel;
import org.example.pages.SuccessPanel;
import org.example.ui_components.BaseButton;
import org.example.ui_components.BaseFrame;
import org.example.ui_components.BasePanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        BaseFrame frame = new BaseFrame();

        // Create panels
        JPanel cardPanel = new JPanel(new CardLayout());
        StartPanel startPanel = new StartPanel(cardPanel);
        GuessingPanel guessingPanel = new GuessingPanel(cardPanel);
        //FailPanel failPanel = new FailPanel();

        // Add panels to the cardPanel
        cardPanel.add(startPanel.getStartPanel(),"StartPanel");
        cardPanel.add(guessingPanel.getGuessingPanel(),"GuessingPanel");

        //Add the cardPanel to the frame
        frame.add(cardPanel);

        // Set the default panel to display
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.show(cardPanel,"StartPanel");

        frame.setVisible(true);

    }
}