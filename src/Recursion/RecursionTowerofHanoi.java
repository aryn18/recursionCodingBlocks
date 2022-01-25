package Recursion;

import java.util.Scanner;

public class RecursionTowerofHanoi {
    static int count =0;


    public static void towerOfHanoi(int n, String from, String to, String aux){
        if(n==1){

            System.out.println("Move 1th disc from "+from+" to "+to);
            count++;
            return;
        }
        towerOfHanoi(n-1,from,aux,to);
        System.out.println("Move "+n+"th disc from "+from+" to "+to);
        count++;
        towerOfHanoi(n-1,aux,to,from);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "T1", "T2", "T3");
        System.out.println(count);
    }


}
