package com.company;

import java.util.Scanner;
import static java.lang.Math.*;

public class Lesson1_5 {
    public static void main (String[] args){

            Scanner sc=new Scanner(System.in);

            System.out.println("Input cordinate 1:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Input cordinate 2:");
            int c = sc.nextInt();
            int d = sc.nextInt();

            double e = sqrt (pow((c-a),2)+pow((d-b),2));
            System.out.println("Average="+e);
    }
}
