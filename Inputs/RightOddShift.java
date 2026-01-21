package Inputs;

import java.util.ArrayList;

public class RightOddShift {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int c=0;
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                temp.add(arr[i]);
            }
             if(arr[i]%2!=0){
                temp2.add(arr[i]);
            }
            
        }
        
        int sz = temp.size();
         for(int i=0;i<sz;i++){
            arr[i] = temp.get(i);
         }
        //   for(int i=0;i<sz;i++){
        //     System.out.print(arr[i]);
        //  }
         for(int i = 0;i<temp2.size();i++){
            arr[i+sz]=temp2.get(i);
         }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }
}
