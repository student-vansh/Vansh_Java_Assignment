import java.util.Scanner;

public class RightInvertedHalfTr {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Rows:");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
        System.out.print("*");
        }
        System.out.println();
        }
    }
}
