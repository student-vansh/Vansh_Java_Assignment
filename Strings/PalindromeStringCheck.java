package Strings;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        String str="Nitin";
        String str1="";
        String str2=str;
        for(int i=str.length()-1;i>=0;i--){
            str1= str1+str.charAt(i);
        }
        if(str2.equalsIgnoreCase(str1)){
            System.out.println("String is palindrome");

        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
