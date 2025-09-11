import java.util.Scanner;

public class HollowSraureWithDiagonal {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Rows:");
        n = sc.nextInt();
     for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
             if(i==1 || i==n || j==1 || j==n || j==(n-i+1) || i==j){
                 System.out.print("*");
             }
             else{
                System.out.print(" ");
             }

            }
            
            System.out.println();

        }
   } 
}
