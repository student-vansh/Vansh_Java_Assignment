package Inputs;

import java.util.Scanner;

public class FirstInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your name:");
        String name = sc.nextLine();
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();

        System.out.println("Your name is :"+name);
        System.out.println("Your age is :"+age);
        System.out.println("Your marks is :"+marks);

        //next() ye whitespace tak data ko read krta hai
        //nextLine() ye nextline tak data ko read krta hai
    }
}
