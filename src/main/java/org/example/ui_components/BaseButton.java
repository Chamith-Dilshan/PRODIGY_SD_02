package org.example.ui_components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseButton extends JButton implements ActionListener{
    public BaseButton(String text){
        this.setPreferredSize(new Dimension(150,40));
        this.setText(text);
        this.setFocusable(false);
        this.setVisible(true);
        this.setFont(new Font("Source Code Pro",Font.BOLD,20));
        this.setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
