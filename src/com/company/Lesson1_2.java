package com.company;
import java.util.Scanner;

public class Lesson1_2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Inpur Radius:");
        int r =sc.nextInt();
        double pi = 3.14;

        System.out.println("L= "+2*pi*r);
        System.out.println ("S= "+pi*r*r);


    }
}
