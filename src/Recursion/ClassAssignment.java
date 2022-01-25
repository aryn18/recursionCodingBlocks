package Recursion;

import java.util.Scanner;

public class ClassAssignment {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int i = 1;
        while(t-->0) {
            int n = scn.nextInt();
            System.out.println("#" + i + " : " + solve("", n, false));
            i++;
        }
        scn.close();
    }

    public static int solve(String ans, int n, boolean isPreviousCallOfb) {
        if(ans.length() == n) {
            return 1;
        }

        if(ans.length() > n) {
            return 0;
        }

        int count = 0;
        count += solve(ans+'a', n, false);
        if(!isPreviousCallOfb) {
            count += solve(ans+'b', n, true);
        }
        return count;
    }

}
