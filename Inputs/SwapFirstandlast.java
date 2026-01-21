package Inputs;

public class SwapFirstandlast {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
    //    arr[0]= arr[0]+arr[arr.length-1];
    //    arr[arr.length-1] = arr[0]-arr[arr.length-1];
    //    arr[0]=arr[0]-arr[arr.length-1];


    // int temp = arr[0];
    // arr[0] = arr[arr.length -1];
    // arr[arr.length-1] = temp;


    arr[0]= arr[0]^arr[arr.length-1];
       arr[arr.length-1] = arr[0]^arr[arr.length-1];
       arr[0]=arr[0]^arr[arr.length-1];
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
      
    }
}
