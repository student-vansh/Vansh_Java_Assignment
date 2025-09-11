import java.util.Scanner;

public class RhombusPattern {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Rows:");
        n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {
               System.out.print("*");

            }
            
            System.out.println();

        }
   } 
}
