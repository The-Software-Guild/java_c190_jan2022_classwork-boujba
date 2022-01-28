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
public class Square extends Shape {
    
    private final double side;
    
    public Square(String color, double side)
    {super(color);
    this.side = side;}

    @Override
    public double getArea() {
        return (side*side);
        }

    @Override
    public double getPerimeter() {return 4*side;}

    
    
}
