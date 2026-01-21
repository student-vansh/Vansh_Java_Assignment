package Recursion;

import java.util.Scanner;

public class Power{
    static int doPowerFind(int n,int exp){
        if(exp==0){
            return 1;

        }
        return (n*doPowerFind(n,exp-1));
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        n=sc.nextInt();
        int base;
        System.out.println("Enter the Exponent");
        base = sc.nextInt();
        int p = doPowerFind(n,base);
        System.out.println("The Answer is:"+p);
    }
}