package Numbers;

import java.util.Scanner;

public class HCfNumber {
    public static void main(String[] args) {
        int num1,num2,min,hcf=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number:");
        num2 = sc.nextInt();
        if(num1 > num2){
           min = num2;
        }
        else{
            min = num1;
        }
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF is :"+hcf);

    }
}
