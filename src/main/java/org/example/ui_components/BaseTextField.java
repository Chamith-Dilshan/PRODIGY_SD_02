package org.example.ui_components;

import javax.swing.*;
import java.awt.*;

public class BaseTextField extends JTextField {
    public BaseTextField(String text){
        this.setPreferredSize(new Dimension(250,50));
        this.setFont(new Font("Source Code Pro",Font.BOLD,20));
        this.setBackground(Color.WHITE);
        this.setText(text);
        this.setVisible(true);
    }
}
