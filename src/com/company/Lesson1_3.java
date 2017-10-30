package com.company;

import java.util.Scanner;

public class Lesson1_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Value 1:");
        float a =sc.nextInt();
        System.out.println("Value 2:");
        float b =sc.nextInt();
        double c = (a+b)/2;
        System.out.println("Average="+c);

    }
}
