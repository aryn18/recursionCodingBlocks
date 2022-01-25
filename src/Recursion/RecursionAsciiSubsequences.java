package Recursion;

import java.util.Scanner;

public class RecursionAsciiSubsequences {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int ans = printASCIISubsequence(str, "");
        System.out.println();
        System.out.println(ans);
        scn.close();
    }

    public static int printASCIISubsequence(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }

        int count = 0;
        char ch = str.charAt(0);
        count += printASCIISubsequence(str.substring(1), ans);
        count += printASCIISubsequence(str.substring(1), ans + ch);
        count += printASCIISubsequence(str.substring(1), ans + (int)ch);
        return count;
    }
}
