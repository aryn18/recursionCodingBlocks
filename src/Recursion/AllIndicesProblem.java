package Recursion;

import java.util.Scanner;

public class AllIndicesProblem {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        printAllIndicies(arr, m, 0);
        scn.close();
    }

    public static void printAllIndicies(int[] arr, int target, int index) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            System.out.print(index + " ");
        }

        printAllIndicies(arr, target, index+1);
    }

}
