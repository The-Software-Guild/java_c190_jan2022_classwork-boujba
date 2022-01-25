/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E3;

import java.util.Scanner;

/**
 *
 * @author youssef
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int favorite_number;
        int my_number = 13;
        String fruit;
        String color;
        String name;
        //Ask the user for their name.
         System.out.println("Hello there! ");
        System.out.println(" What's your name? ");
        
        name = inputReader.nextLine();
        //Display that name and tell them yours (or your AI's name!).
         System.out.println("Hi,"+name+"!  I'm Alice. ");
         //Ask them for their favorite color.
         System.out.println("What's your favorite color?");
         
        color = inputReader.nextLine();
        
         System.out.println("Huh, "+color+"? Mine's Electric Lime. ");
        
        //Display the color they enter in a conversational way.
         System.out.println("I really like limes. Theyre my favorite fruit, too. ");
        
        //Do the same thing with favorite food and number, and then say goodbye!
        
      
        System.out.println(" -What's YOUR favorite fruit, "+name+"?  ");
         
        fruit = inputReader.nextLine();    
        System.out.println(" Really? "+fruit+"? That's wild!");
         System.out.println("Speaking of favorites,What's YOUR favorite number, "+name+"?  ");        
        favorite_number = Integer.parseInt(inputReader.nextLine());
        System.out.println("42 is a cool number. Mine's "+my_number+".");
        
        System.out.println("Did you know "+favorite_number+" * "+my_number+" is "+my_number*favorite_number+"? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, "+name+"!");
    
    }
    }
    

