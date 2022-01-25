package Recursion;

import java.util.Scanner;

public class CountNQueen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        queenCombo(board,0,n);
        System.out.println(count);
    }
    static int count;
    public static boolean isItSafeToPlaceQueen(int[][]board,int cr,int cc,int n){
        for(int row=0;row<=cr-1;row++){
            if(board[row][cc]==1){
                return false;
            }
        }
        int row=cr;
        int col=cc;
        while(row>=0 && col<n){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        row=cr;
        col=cc;
        while(row>=0 && col>=0){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col--;
        }
        return true;
    }
    public static void queenCombo(int[][] board, int cr, int n){
        if(cr==n){
            count++;
            return;
        }
        for(int cc=0; cc < n; cc++){
            if(isItSafeToPlaceQueen(board,cr,cc,n)){
                board[cr][cc]=1;
                queenCombo(board,cr+1,n);
                board[cr][cc]=0;
            }
        }
    }
}
