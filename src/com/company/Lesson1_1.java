package com.company;

import java.util.Scanner;

public class Lesson1_1 {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        System.out.println("Input a");
        int a = sc.nextInt();
        System.out.println("Input b");
        int b = sc.nextInt();

        System.out.println("parameter = "+2*(a+b));;
        System.out.println("square = "+a*b);
        sc.close();
    }
}
