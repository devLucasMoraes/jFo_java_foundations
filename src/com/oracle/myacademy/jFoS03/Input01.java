package com.oracle.myacademy.jFoS03;

import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String inputString = JOptionPane.showInputDialog("Digite algo:");
        //Store the input as a String and print it.
        System.out.println(inputString);

        
        //Parse the input as an int.
        int input = Integer.parseInt(inputString);
        //Print its value +1
        input++;
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
