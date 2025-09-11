package Strings;

public class CountVowelsConst {
    public static void main(String[] args) {
        String s="Vansh";
    int c=0;
    int v=0;
     for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='a' || s.charAt(i)== 'e' || s.charAt(i)=='i' ||  s.charAt(i)=='o'||  s.charAt(i)=='u' ||  s.charAt(i)=='A' ||  s.charAt(i)=='E' ||  s.charAt(i)=='I' ||  s.charAt(i)=='O' ||  s.charAt(i)=='U'){
                v++;
              }
             else{
                c++;
             }
    
        }
        System.out.println("The Vowels are :"+v);
        System.out.println("The Constant are :"+c);
    }
}
