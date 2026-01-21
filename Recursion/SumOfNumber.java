package Recursion;

import java.util.Scanner;

public class SumOfNumber {
    static int SumNumber(int low ,int uper){
        if(low == uper) return low;
        else return low + SumNumber(low+1, uper);
    }
    public static void main(String[] args) {
        int low;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        low=sc.nextInt();
        int uper;
        System.out.println("Enter the second Number");
        uper = sc.nextInt();
        int sum =SumNumber(low,uper);
        System.out.println(sum);
    }
}
