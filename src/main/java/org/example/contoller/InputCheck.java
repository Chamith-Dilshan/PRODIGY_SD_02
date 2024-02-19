package org.example.contoller;

import org.example.ui_components.BaseTextField;

import javax.swing.*;

public class InputCheck {
    public static String inputHandler(BaseTextField textField, int randomNumber){
        String input = textField.getText();

        //Check if userInputText is empty or null
        if(input == null || input.isEmpty()){
            handelEmptyOrNullInput();
            textField.setText("");
            return  "fail";
        }
        else{
            try{
               double userInput = Double.parseDouble(input);
                return handelValidNumberInput(userInput,randomNumber);
            }
            catch(NumberFormatException e){
                handelInvalidNumberInput();
                textField.setText("");
                return "fails";
            }
        }
    }

    private static void handelInvalidNumberInput() {
        JOptionPane.showMessageDialog(null,"Please Enter a Valid Number","Error",JOptionPane.ERROR_MESSAGE);
    }

    private static String handelValidNumberInput(double userInput,int randomNum) {
        if(userInput > randomNum){
            return "high";
        } else if (userInput < randomNum) {
            return "low";
        }
        else if(userInput == randomNum){
            return "success";
        }
        return "fails";
    }

    private static void handelEmptyOrNullInput() {
        JOptionPane.showMessageDialog(null, "Please Enter a Number","Error",JOptionPane.ERROR_MESSAGE);
    }
}
