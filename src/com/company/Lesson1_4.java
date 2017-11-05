package com.company;


import java.util.Scanner;
import static java.lang.Math.*;

public class Lesson1_4 {
 public static void main(String[] args){

   Scanner sc=new Scanner(System.in);

           System.out.println("Input value1:");
            int a=sc.nextInt();
            System.out.println("Input value2:");
            int b=sc.nextInt();

            double c =sqrt (a*b);
            System.out.println("Geometric avarage:"+c);
      }
    }
