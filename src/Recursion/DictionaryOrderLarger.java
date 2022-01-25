package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrderLarger {
    private static ArrayList<String> permPerm(String inp, String out, String ext, ArrayList<String> al){
        if(inp.length()==0){
            int result = out.compareTo(ext);
            if(result>0){
                al.add(out);
            }
            return al;
        }

        for(int i=0;i<inp.length();i++){
            char cith = inp.charAt(i);
            permPerm(inp.substring(0,i)+inp.substring(i+1),out+cith,ext,al);
        }
        return al;
    }
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String str = s;
        ArrayList<String> al = new ArrayList<String>();
        permPerm(s,"",str,al);
        Collections.sort(al);
        for(String st: al){
            System.out.println(st);
        }
    }

}
