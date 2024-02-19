package org.example.pages;

import org.example.ui_components.BaseButton;
import org.example.ui_components.BaseLable;
import org.example.ui_components.BasePanel;
import org.example.ui_components.BaseTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static org.example.contoller.InputCheck.inputHandler;

public class GuessingPanel {
    private final BasePanel guessingPanel = new BasePanel();
   private final BasePanel insidePanel1 = new BasePanel();
    private final BasePanel insidePanel2 = new BasePanel();
    private final BaseLable textLabel1 = new BaseLable("<html>I have a Number in my mind<br><center>Can you Guess it?</center></html>");
   private final BaseLable textLabel2 = new BaseLable("Enter a number Between 0 - 10");
   private final BaseLable outputLabel = new BaseLable("");
   private final BaseLable warningLabel = new BaseLable("");
   private final BaseButton checkButton = new BaseButton("Check");
   private final BaseButton clearButton = new BaseButton("Clear");
   private BaseTextField textField = new BaseTextField("Enter a Number");
   private int counter = 0;
   Random random = new Random();
   private final int randomNum = random.nextInt(0,11);

   public GuessingPanel(JPanel cardPanel){
       guessingPanel.setLayout(new GridLayout(3,1));
       insidePanel1.setLayout(new GridLayout(4,1));
       insidePanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));

       // Add components to insidePanel1
       insidePanel1.add(textLabel2);
       insidePanel1.add(warningLabel);
       insidePanel1.add(textField);
       insidePanel1.add(outputLabel);

       // Add components to insidePanel2
       insidePanel2.add(checkButton);
       insidePanel2.add(clearButton);

       // Center-align the components
       textLabel1.setHorizontalAlignment(SwingConstants.CENTER);
       textLabel2.setHorizontalAlignment(SwingConstants.CENTER);
       warningLabel.setHorizontalAlignment(SwingConstants.CENTER);
       textField.setHorizontalAlignment(SwingConstants.CENTER);
       outputLabel.setHorizontalAlignment(SwingConstants.CENTER);

       // Reduce button size
       checkButton.setPreferredSize(new Dimension(100, 40));
       clearButton.setPreferredSize(new Dimension(100, 40));

       // Add components to the guessingPanel
       guessingPanel.add(textLabel1);
       guessingPanel.add(insidePanel1);
       guessingPanel.add(insidePanel2);



       //Add Action listener
       checkButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               //Check if userInputText is empty or null
               String result =inputHandler(textField,randomNum);
               counter++;

               switch (result) {
                   case "success" -> {
                       CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                       SuccessPanel successPanel = new SuccessPanel(cardPanel,counter);
                       cardPanel.add(successPanel.getSuccessPanel(),"SuccessPanel");
                       cardLayout.show(cardPanel, "SuccessPanel");
                   }
                   case "high" -> {
                       warningLabel.setText("Wrong");
                       outputLabel.setText("The input number is High");
                       textField.setText("");
                   }
                   case "low" -> {
                       warningLabel.setText("Wrong");
                       outputLabel.setText("The input number is Low");
                       textField.setText("");
                   }
                   default -> {
                       warningLabel.setText("Wrong");
                       textField.setText("");
                   }
               }
           }
       });
       clearButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               warningLabel.setText("Wrong");
               textField.setText("");
           }
       });
   }

    public JPanel getGuessingPanel() {
       return guessingPanel;
    }

}
