package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on $DATE
 **/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        boolean OK = true;
        Scanner input = new Scanner(System.in);

        while (OK) {
            System.out.println("Enter the base of the triangle [0 to quit]:");
            double base = input.nextDouble();
            if (base==0) {
                OK=false;
                continue;
            }
            System.out.println("Enter the height of the triangle [0 to quit]:");
            double height = input.nextDouble();
            if (base==0) {
                OK=false;
                continue;
            }
            Triangle A = new Triangle (base,height);

            System.out.println("Triangle's Base: " + A.base + " Height: " + A.height + " Area: "+ A.getArea());
            System.out.println("==============================================");
        }
    }
}

