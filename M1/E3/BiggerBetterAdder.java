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
public class BiggerBetterAdder {
public static void main(String[] args) {
Scanner inputReader = new Scanner(System.in);
//Write a program that stores three different numbers in different variables given by user.
double V1,V2,V3,total;
System.out.println("BiggerBetterAdder needs three values");
 System.out.println("First value?");
      V1 = Integer.parseInt(inputReader.nextLine());
      System.out.println("Second value?");
      V2 = Integer.parseInt(inputReader.nextLine());
      System.out.println("Third value?");
      V3 = Integer.parseInt(inputReader.nextLine());

//Add those variables together and store that in a new variable.

total = V1+V2+V3;
//Display the result as a single math statement, like 1 + 2 + 3 = 6.
System.out.println("Total of "+V1+" + "+V2+" + "+V3+" = "+total);
}
    
}
