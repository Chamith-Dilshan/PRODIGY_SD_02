package org.example.ui_components;

import org.example.pages.StartPanel;

import javax.swing.*;
import java.awt.*;

public class BaseFrame extends JFrame {
    public BaseFrame(){
        this.setSize(500,700);
        this.setLayout(new CardLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Guess Me");

        ImageIcon image = new ImageIcon("src/main/resources/images/logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.WHITE);

        this.setVisible(true);
    }

    public void addPanel(JPanel panel, String panelName) {
        getContentPane().add(panel,panelName);
    }

}
