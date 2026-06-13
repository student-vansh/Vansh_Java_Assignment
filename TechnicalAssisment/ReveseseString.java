package TechnicalAssisment;

public class ReveseseString {
    public static void main(String[] args) {
       String str = "education";
       String rev = "";
       for(int i=0;i<str.length();i++){
            rev = str.charAt(i) +rev;
       }
       System.out.println("The reverse of STring:"+rev);
       System.out.println("This is the Solution of the code");
      
    }
}
