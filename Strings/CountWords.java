package Strings;

public class CountWords {
    public static void main(String[] args) {
        
    String s = " This is  rdec sec f";
        int c=0;
        s=s.trim();// to remove the extrs space from start and end
        for(int i=0;i<s.length();i++){
             // if(s.charAt(i)+""==" ")
            //   if(s.charAt(i)==' '){
            //     c++;
            //    }
             if(s.charAt(i)==' ' && s.charAt(i+1) !=' '){
                c++;
              }
        
             
    
        }
        System.out.println(c+1);
    }
}
