package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int computerNumber = ((int) (Math.random() * 100 + 1));
        int userAnswer = 0;
        System.out.println("Correct Number: " + computerNumber);
        int count = 1;
        while (userAnswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + check_det_Guess(userAnswer, computerNumber, count));
            count++;
        }
    }

    public static String check_det_Guess(int userAnswer, int computerNumber, int count)
    {
        if (userAnswer <=0 || userAnswer >100)
        {
            return "Invalid Guess!";
        }
        else if (userAnswer == computerNumber )
        {
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber)
        {
            return "You Guessed High!!, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber)
        {
            return "You Guessed Low!!, try again.\nTry Number: " + count;
        }
        else
        {
            return "Incorrect Guess!!\nTry Number: " + count;
        }
    }
}