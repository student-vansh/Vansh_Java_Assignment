import java.util.Scanner;

public class RightBinayHalfTriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Rows:");
        n = sc.nextInt();
         int count=1;
        for(int i=0;i<n;i++){
        if(i%2==0) count =1;
        else count=0;
        for(int j=0;j<=i;j++){
        System.out.print(count);
        count =1-count;
        }
        System.out.println();

        }
    }
}
