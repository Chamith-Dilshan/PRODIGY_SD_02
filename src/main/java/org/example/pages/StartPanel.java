package org.example.pages;

import org.example.ui_components.BaseButton;
import org.example.ui_components.BasePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel{
    BasePanel startPanel = new BasePanel();
    BaseButton playButton = new BaseButton("Play");

    public StartPanel(JPanel cardPanel){
        startPanel.setLayout(new FlowLayout(FlowLayout.CENTER,250,300));
        startPanel.add(playButton);

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.show(cardPanel, "GuessingPanel");
            }
        });
    }

    public BasePanel getStartPanel() {
        return startPanel;
    }
}
