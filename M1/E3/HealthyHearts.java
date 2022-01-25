/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E3;

import java.util.Scanner;

/**
 *
 * @author yousserf
 */
public class HealthyHearts {
    public static void main(String[] args) {
Scanner inputReader = new Scanner(System.in);
    double age, max,half_max ,eighty_max ;
    System.out.println("What is your age?");
      age = Integer.parseInt(inputReader.nextLine());
    max = (220- age);
    half_max = max/2 ;
    eighty_max= (max/100)*85;
        System.out.println("Your maximum heart rate should be "+max+"  beats per minute.");
        System.out.println("Your target HR Zone is "+half_max+" - "+eighty_max+" beats per minute.");
    
}

}