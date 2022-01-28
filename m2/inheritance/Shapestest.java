/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author DELL
 */
public class Shapestest 
{
 public static void main(String[] args)
 {
 Shape[] Shapes = { new Square("red",3),new Square("blue",6),new Rectangle("yellow",4,5),new Triangle("blue",4,5),new Circle("red", 7) };
 for (int i = 0; i < Shapes.length; i++)
 {
 System.out.println(Shapes[i]);
 System.out.println("the area is :"+Shapes[i].getArea());
 System.out.println("the perimiter is:"+Shapes[i].getPerimeter());
 System.out.println();
 }
 }
}
