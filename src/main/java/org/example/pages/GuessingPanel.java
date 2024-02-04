package org.example.pages;

import org.example.ui_components.BaseButton;
import org.example.ui_components.BaseLable;
import org.example.ui_components.BasePanel;
import org.example.ui_components.BaseTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingPanel {
   private String warningMessage;
   private String outputMessage;
   private final BasePanel guessingPanel = new BasePanel();
   private final BaseLable textLabel1 = new BaseLable("I have a Number in my mind.\nCan you Guess it?");
   private final BaseLable textLabel2 = new BaseLable("Enter a number Between 0 - 10");
   private final BaseLable outputLabel = new BaseLable(outputMessage);
   private final BaseLable warningLabel = new BaseLable(warningMessage);
   private final BaseButton checkButton = new BaseButton("Check");
   private final BaseButton clearButton = new BaseButton("Clear");
   private final BaseTextField textField = new BaseTextField("Enter a Number");

   public GuessingPanel(){
       guessingPanel.add(textLabel1);
       guessingPanel.add(textLabel2);
       guessingPanel.add(outputLabel);
       guessingPanel.add(warningLabel);
       guessingPanel.add(textField);
       guessingPanel.add(checkButton);
       guessingPanel.add(clearButton);
   }

    public BasePanel getStartPanel() {
        return guessingPanel;
    }

    public JPanel getGuessingPanel() {
       return guessingPanel;
    }
}
