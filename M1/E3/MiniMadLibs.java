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
public class MiniMadLibs {
    public static void main(String[] args) {
Scanner inputReader = new Scanner(System.in);
String noun1,adjective1, noun2,adjective2,PN1,PN2,PN3,verb,pverb;
        int number;
System.out.println("Let's play MAD LIBS!");

System.out.println("I need a noun:"); //1
noun1= inputReader.nextLine();
System.out.println("Now an adjective: ");//2
adjective1= inputReader.nextLine();
System.out.println("Another noun: ");//3
noun2= inputReader.nextLine();
System.out.println("And a number: ");//4
number= Integer.parseInt(inputReader.nextLine());
System.out.println("Another adjective:"); //5
adjective2= inputReader.nextLine();
System.out.println("A plural noun: ");//6
PN1= inputReader.nextLine();
System.out.println("Another one: ");//7
PN2= inputReader.nextLine();
System.out.println("One more: ");//8
PN3= inputReader.nextLine();
System.out.println("A verb (infinitive form):"); //9
verb= inputReader.nextLine();
System.out.println("Same verb (past participle): ");//10
pverb= inputReader.nextLine();

System.out.println("*** NOW LETS GET MAD (libs) ***");
System.out.println(""+noun1+": The "+adjective1+" frontier. "
        + "These are the voyages of the starship "+noun2+"."+"\n"
        + " Its "+number+"-year mission: to explore strange "+adjective2+", "+PN1+"\n"
        + "to seek out "+adjective2+" "+PN2+" and "+adjective2+" "+PN3+" , to boldly "+verb+"\n"
        + "where no one has "+pverb+" before.");
    
}
}