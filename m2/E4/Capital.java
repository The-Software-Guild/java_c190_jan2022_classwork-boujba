/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4;

/**
 *
 * @author DELL
 */
public  class Capital {
   
    private String Name,Population, Squaremileage;
    public Capital(String name, String population, String Squaremileage)
    {this.Name=name;
    this.Population = population ; 
    this.Squaremileage = Squaremileage ;
    }
    public String getname(){return this.Name;}
    public String getpopulation(){return this.Population;}
    public String getsquaremileage() {return this.Squaremileage ;}
    
}
