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
public class AllTheTrivia {
    
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
    
        
        String unit, rotates, volcano,element;
    System.out.println(" What unit is equivalent to 1,024 Gigabytes? ");
    unit = inputReader.nextLine();
    System.out.println(" Which planet is the only one that rotates clockwise in our Solar System? ");
    rotates = inputReader.nextLine();
    System.out.println(" The largest volcano ever discovered in our Solar System is located on which planet? ");
    volcano = inputReader.nextLine();
    
    System.out.println(" What is the most abundant element in the earth's atmosphere? ");
     element = inputReader.nextLine();
    //output with mixed answears 
    System.out.println(" Wow, 1,024 Gigabytes is a "+volcano+"!");
    
    System.out.println(" I didn't know that the largest ever volcano was discovered on "+element+"!");
    
    System.out.println(" That's amazing that "+unit+" is the most abundant element in the atmosphere...");
    
    System.out.println(" "+rotates+" is the only planet that rotates clockwise, neat!");
    
}
}
