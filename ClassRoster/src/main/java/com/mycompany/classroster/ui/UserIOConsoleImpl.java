/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classroster.ui;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class UserIOConsoleImpl implements UserIO{
private Scanner console = new Scanner(System.in);
    @Override
    public void print(String msg) {
        System.out.println(msg); }

    @Override
    public double readDouble(String prompt) {
        double result = 0.0;
        boolean message = true;
        while(message)
        {print(prompt);
        try
        {
        result = Double.parseDouble(console.nextLine());
        message = false;}
        catch(NumberFormatException e){throw new UnsupportedOperationException("input double error, try again ");}
        }
         return result;}

    @Override
    public double readDouble(String prompt, double min, double max) {
          double result = 0.0;
        boolean firsttry = true;
    while(firsttry){}
    return result;}

    @Override
    public float readFloat(String prompt) {
        throw new UnsupportedOperationException("Not supported yet.");  }

    @Override
    public float readFloat(String prompt, float min, float max) {
        throw new UnsupportedOperationException("Not supported yet.");    }

    @Override
    public int readInt(String prompt) {
        int result = 0;
        boolean message = true;
        while(message)
        {print(prompt);
        try
        {
        result = Integer.parseInt(console.nextLine());
        message = false;}
        catch(NumberFormatException e){throw new UnsupportedOperationException("input double error, try again ");}
        }
         return result;}

    @Override
    public int readInt(String prompt, int min, int max) {
         int result = 0;
        boolean message = true;
        while(message)
        {print(prompt);
        try
        {
        result = Integer.parseInt(console.nextLine());
        message = false;}
        catch(NumberFormatException e){throw new UnsupportedOperationException("input double error, try again ");}
        }
         return result; }

    @Override
    public long readLong(String prompt) {
        throw new UnsupportedOperationException("Not supported yet.");   }

    @Override
    public long readLong(String prompt, long min, long max) {
        throw new UnsupportedOperationException("Not supported yet.");   }

    @Override
    public String readString(String prompt) {
        String result="";
        boolean message = true;
        while(message)
        {print(prompt);
        try
        {
        result = console.nextLine();
        message = false;}
        catch(NumberFormatException e){throw new UnsupportedOperationException("input double error, try again ");}
        }
         return result; }
    
}
