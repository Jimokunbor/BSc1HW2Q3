/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsc1hw2q3;

import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class BSc1HW2Q3 {

    /**
     * Sample answer to Homework 2, Q 3
     * 
     * Ask user for a number and output whether it is odd or even
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in);
        
        int userInput;
        
        System.out.println("Please enter a number: ");
        
        userInput = myKB.nextInt();
        
        //two possibilities only
        if ( userInput % 2 == 0){
            //userInput is EVEN
            System.out.println("That is an even number");
        }
        else{
            //must be odd
            System.out.println("That is an odd number");
        }
        
        //QUESTION -- How do you stop a "crash" if the user enters text??
    }
    
}
