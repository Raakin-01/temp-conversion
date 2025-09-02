package com.raakin;
import java.util.Scanner;
 public class Main{
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.print("enter the celsius temp:");
         float cel=input.nextFloat();
         float  num= (float)(9f/5f);
         float far=(cel*(num))+32;
         System.out.println("the temperature in farenhite is: "+far);
     }

}


