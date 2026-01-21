package Strings;

import java.util.ArrayList;

public class StringSubsequence {
    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (temp.isEmpty()) {
                temp.add("");
                temp.add(ch + "");
                continue;
            }
            int tempsize = temp.size();
            for(int j=0;j <tempsize;j++){
                temp.add(temp.get(j)+ch); 
            }
        }
        System.out.println(temp);
    }
}
