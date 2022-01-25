package Recursion;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int length=a.length;
        int[] revArray=reverseArray(a ,0,length-1);
        for(int i:revArray)
            System.out.print(i+" ");
    }
    public static int[] reverseArray(int[] a,int i,int j){

        if(i<j){

            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            reverseArray(a, i+1, j-1);
        }
        return a;
    }
}
