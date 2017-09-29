/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 * Chapter 4 Exercise 9
 * 
 * Write a program that will create a new string that is the reverse of the 
 * entered string.
 * 
 * @author skiroc
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instance variables
        Scanner kb = new Scanner(System.in);
        String sentence = "";
        String reverseSentence = "";
        
        // Prompting the user to enter a sentence
        System.out.println("Please enter a sentence:");
        sentence = kb.nextLine();
        
        // Splitting the sentence into an array 
        String words[] = sentence.split(" ");
        
        // Looping through the array in backwards order and printing
        // out the words in reverse
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] + " ";
            
        }
        
        // Displaying reverse sentence
        System.out.println(reverseSentence);
    }
    
}
