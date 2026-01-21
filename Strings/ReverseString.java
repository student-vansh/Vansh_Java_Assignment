package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="Vansh";
        String str1="";
        // for(int i=str.length()-1;i>=0;i--){
        //     str1= str1+str.charAt(i);
        // }
        // System.out.println(str1);

         for(int i=0;i<str.length();i++){
            str1= str.charAt(i)+str1;
        }
        System.out.println(str1);
    }  
}
