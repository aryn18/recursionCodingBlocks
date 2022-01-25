package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazepathD2CountPrint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        ArrayList ans = getmazepath(0, 0, N - 1, N - 1);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        System.out.println(output(0, 0, N - 1, N - 1));

    }

    public static ArrayList<String> getmazepath(int cr, int cc, int er, int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> bRes = new ArrayList<>();
            return bRes;
        }
        ArrayList<String> myres = new ArrayList<>();

        ArrayList<String> resultv = getmazepath(cr + 1, cc, er, ec);

        for (String val : resultv) {
            myres.add("V" + val);
        }

        ArrayList<String> resulth = getmazepath(cr, cc + 1, er, ec);

        for (String val : resulth) {
            myres.add("H" + val);
        }

        if (cr == cc || cr + cc == er) {
            ArrayList<String> resultd = getmazepath(cr + 1, cc + 1, er, ec);

            for (String val : resultd) {
                myres.add("D" + val);
            }

        }

        return myres;

    }

    public static int output(int cr, int cc, int er, int ec) {
        int count = 0;
        if (cr == er && cc == ec) {
            return 1;
        }
        if (cr > er || cc > ec) {
            return 0;
        }

        count = count + output(cr + 1, cc, er, ec);
        count = count + output(cr, cc + 1, er, ec);
        if (cr == cc || cr+cc == er) {

            count = count + output(cr + 1, cc + 1, er, ec);
        }

        return count;
    }
}
