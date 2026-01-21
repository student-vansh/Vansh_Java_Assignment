package Recursion;

import java.util.Scanner;

public class PrintNaturalNumber {
    static void PrintNumber(int low,int uper){
        if(low > uper) return;
        System.out.println(low);
        PrintNumber(low+1, uper);
    }
   public static void main(String[] args) {
     
     int low;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        low=sc.nextInt();
        int uper;
        System.out.println("Enter the Exponent");
        uper = sc.nextInt();
        PrintNumber(low,uper);
   }   
}
