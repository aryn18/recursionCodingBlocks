package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursionSubsequences {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String question = scn.nextLine();
        ArrayList<String> list = new ArrayList<>();
        int count = printSubsequence(question, "", list);
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(count);
    }

    public static int printSubsequence(String question, String ans , List<String> list) {
        if(question.length() == 0) {
            list.add(ans);
            return 1;
        }

        int count = 0;
        char ch = question.charAt(0);
        count += printSubsequence(question.substring(1), ans + ch, list);
        count += printSubsequence(question.substring(1), ans, list);
        return count;
    }

}
