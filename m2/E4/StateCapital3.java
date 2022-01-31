/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StateCapital3 {
    public static void main(String[] args) throws FileNotFoundException {
        //this is ther reader and scanner
          Map<String, Capital> StateCapitals = new HashMap<>();
        Scanner sc = new Scanner(
    new BufferedReader(new FileReader("D:\\test1\\Allclassexamples\\src\\main\\java\\E4\\capitals.txt")));
    // go through the file line by line
    while (sc.hasNextLine()) {
    String currentLine = sc.nextLine();
    //System.out.println(currentLine);
     String[] array1 = currentLine.split("::");
    //for (int i = 0; i < array1.length; i++)
    //{System.out.println(array1[i]);}
    Capital cap = new Capital( array1[1],array1[2], array1[3]) ;
     StateCapitals.put(array1[0],cap);
     
}
        
        
       
    
        /*
     System.out.println("=== Iterating over a HashMap  ===");
         System.out.println("STATES");
            System.out.println("====================");
            StateCapitals.forEach((states, capitals) -> {
            
            System.out.println(states );
        });
            System.out.println("====================");
            System.out.println("====================");
            System.out.println("CAPITALS ");
            System.out.println("====================");
               StateCapitals.forEach((states, capitals) -> {
            
            System.out.println(capitals.getname());
        });
               System.out.println("====================");
    */
               System.out.println("====================");
               System.out.println("STATE/CAPITAL PAIRS WITH DETAILS:");
            System.out.println("====================");
        StateCapitals.forEach((states, capitals) -> {
            
            System.out.println(states + " => " + capitals.getname()+ " [Population=> " +capitals.getpopulation()+ "  [Area => " +capitals.getsquaremileage());
        });
                       System.out.println("====================");               System.out.println("====================");
       System.out.println("Please enter the lower limit for capital city population:");
       Scanner inputReader = new Scanner(System.in);
       double lowerlimit= inputReader.nextDouble();
                      System.out.println("====================");
                                     System.out.println("====================");
       System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN "+lowerlimit+":");
       StateCapitals.forEach((states, capitals) -> {
            if((Double.parseDouble(capitals.getpopulation())) > lowerlimit ){
            System.out.println(states + " => " + capitals.getname()+ " [Population=> " +capitals.getpopulation()+ "[Area => " +capitals.getsquaremileage());
        }});
                      System.out.println("====================");               System.out.println("====================");
       System.out.println("Please enter the upper limit for capital city sq mileage:");
      
       double limitsqv = inputReader.nextDouble();
       
       System.out.println("LISTING CAPITALS WITH Areas LOWER THAN "+limitsqv+":");
       StateCapitals.forEach((states, capitals) -> {
            if((Double.parseDouble(capitals.getsquaremileage())) < limitsqv ){
            System.out.println(states + " => " + capitals.getname()+ " [Population=> " +capitals.getpopulation()+ "[Area => " +capitals.getsquaremileage());
        }});
                      System.out.println("====================");               System.out.println("====================");
       
       
  }

  
}

    
