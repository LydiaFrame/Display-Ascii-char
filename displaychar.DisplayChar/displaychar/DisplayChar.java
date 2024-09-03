/*
 * Program: DisplayChar.java
 * 
 * Student: Lydia Frame
 * 
 * Purpose:Assignment 2 – Create a program that generates a number from 65 to 90 
 * and display the ASCII char character for each number.
 */
package displaychar;
 import java.util.Scanner;

public class DisplayChar{
    public static void main(String[] args){

        //Variables
        int ChNum;
        char ch;

        //Generate random number between 65 and 90 
        ChNum = (int)(65 + Math.random() * (90 - 65 + 1)); 

        //Convert to char value 
        ch = (char)ChNum;

        //Display ASCII char
        System.out.println("ASCII numeric value = " + ChNum);
        System.out.println("ASCII letter value = " + ch);

    }
}