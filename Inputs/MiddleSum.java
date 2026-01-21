package Inputs;

public class MiddleSum {
    public static void main(String[] args) {
        int n=12341;
        n=n/10;
        int sum =0;
       while (n >= 10) {
         int r= n%10;
            sum= sum+r;
            n=n/10;
           
       }
        System.out.println(sum);
    }
}
