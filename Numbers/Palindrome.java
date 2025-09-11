package Numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int r,s=0,m;
      /*for(int i=1;i<=10;i++){
        System.out.print(n*i+" ");
      }*/

      //Reverse of the Number
      
      /*while (n>0){
           r=n%10;
           s=s*10+r;
           n=n/10;
      }
      System.out.print(s);*/
     
      //Plaindrome
      m=n;
      while (n>0) {
        r=n%10;
        s=s*10+r;
        n=n/10;
      }
      if (m==s) {
        System.out.print("NUmber is Palindrome");
      }
      else{
        System.out.print("Number is NOt Palindrome");
      }

    }
}
