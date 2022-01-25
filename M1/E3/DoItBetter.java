/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DoItBetter {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
    
    int miles,hotdogs,languages;
   
     // by multiplying their number by 2 and adding 1.
    
     System.out.println("how many miles can you run ?");
      miles = Integer.parseInt(inputReader.nextLine());
      System.out.println(" Well i can run "+(miles*2+1)+" miles");
     
     System.out.println("how many Hoty dogs can you eat ?");
      hotdogs = Integer.parseInt(inputReader.nextLine());
      System.out.println(" Well i can eat "+(hotdogs*2+1)+" Hot dogs");
      
     System.out.println(" How many languages do you know ?");
      languages = Integer.parseInt(inputReader.nextLine());
      System.out.println(" Well i can speak "+(languages*2+1)+" Languages");
            
    
}}
