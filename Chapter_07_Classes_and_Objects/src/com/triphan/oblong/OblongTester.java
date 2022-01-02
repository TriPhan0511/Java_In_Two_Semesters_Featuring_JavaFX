package com.triphan.oblong;

import java.util.Scanner;

public class OblongTester
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double oblongLength, oblongHeight;
        Oblong myOblong;

//        Gets the values from the user
        System.out.print("length: ");
        oblongLength = keyboard.nextDouble();
        System.out.print("height: ");
        oblongHeight = keyboard.nextDouble();

//        Creates a new Oblong object
        myOblong = new Oblong(oblongLength, oblongHeight);

        System.out.println("Oblong length is " + myOblong.getLength());
        System.out.println("Oblong height is " + myOblong.getHeight());
        System.out.println("Oblong area is " + myOblong.calculateArea());
        System.out.println("Oblong perimeter is " + myOblong.calculatePerimeter());
    }

}
