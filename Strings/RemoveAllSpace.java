package Strings;

public class RemoveAllSpace {
    public static void main(String[] args) {
        String s = " This is  rdec sec f";
        String a = s.replaceAll(" ", "");
        System.out.println(a);
    }
}
