package Recursion;

import java.util.Scanner;

public class LastIndex {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(printLastIndex(arr, m, arr.length-1));
    }

    public static int printLastIndex(int[] arr, int target, int index) {
        if(index < 0) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        }

        return printLastIndex(arr, target, index-1);
    }

}
