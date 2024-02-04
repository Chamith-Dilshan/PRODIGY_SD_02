package org.example.ui_components;

import javax.swing.*;
import java.awt.*;

public class BaseLable extends JLabel {
    public BaseLable(String text){
        this.setText(text);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalTextPosition(CENTER);
        this.setBackground(Color.WHITE);
        this.setFont(new Font("Source Code Pro",Font.BOLD,20));
        this.setVisible(true);
    }
}
