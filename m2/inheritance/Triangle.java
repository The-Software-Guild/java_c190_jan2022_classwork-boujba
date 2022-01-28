/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author DELL
 */
public class Triangle extends Shape {
        private final double base,height, hyp;
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height ;
    hyp = Math.pow(Math.pow(base, 2) + Math.pow(height, 2),0.5);}

    @Override
    public double getArea() {return 0.5 * base * height ;}

    @Override
    public double getPerimeter() {return base + height + hyp; }
    
}
