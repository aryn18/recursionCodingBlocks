package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartKeypadI {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKp(str);

        String srrr[] = new String[words.size()];
        for(int j =0;j<words.size();j++){
            srrr[j] = words.get(j);
        }
        for(String k: srrr)
        {
            System.out.println(k);
        }
    }
    static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };

    public static ArrayList<String> getKp(String str){
        if(str.length() == 0){
            ArrayList<String> brs = new ArrayList<>();
            brs.add("");
            return brs;
        }
        char ch = str.charAt(0);
        String res = str.substring(1);

        ArrayList<String> rrs = getKp(res);

        ArrayList<String> mrs = new ArrayList<>();

        String code = table[ch - '0'];
        for(int i = 0; i < code.length() ; i++){
            char chcode = code.charAt(i);
            for(String rstr : rrs){
                mrs.add(chcode + rstr);
            }
        }
        return mrs;
    }

}
