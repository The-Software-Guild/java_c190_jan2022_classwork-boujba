/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StateCapitals;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author DELL
 */
public class HashMaptest {
    public static void main(String[] args) {
        
        Map<String, String> StateCapitals = new HashMap<>();
    
        StateCapitals.put("Alabama" , "Montgomery");
        StateCapitals.put("Alaska" , "Juneau");
        StateCapitals.put("Arizona" , "Phoenix");
        StateCapitals.put("Arkansas" , "Little Rock");
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
            
            System.out.println(capitals);
        });
               System.out.println("====================");
               System.out.println("====================");
               System.out.println("STATE/CAPITAL PAIRS:");
            System.out.println("====================");
        StateCapitals.forEach((states, capitals) -> {
            
            System.out.println(states + " => " + capitals);
        });
  }}
