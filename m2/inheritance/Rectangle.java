/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Rectangle extends Shape {
    
    private final double side1,side2;
    
    public Rectangle(String color,double side1, double side2)
    {super(color);
    this.side1 = side1;
    this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1*side2);
        }

    @Override
    public double getPerimeter() {return ((2*side1)+(2*side2));}

    
    
}
