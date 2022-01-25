package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazepathCountPrint {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> path = getMaze(1,1,n,m);
        String str[] = new String[path.size()];
        for(int j =0;j<path.size();j++){
            str[j] = path.get(j);
        }
        int count =0;
        for(String k: str)
        {
            System.out.print(k + " ");
            count++;
        }
        System.out.println();
        System.out.println(count);
    }

    public static ArrayList<String> getMaze(int sr, int sc, int dr, int dc){

        if( sr == dr && sc == dc){
            ArrayList<String> b = new ArrayList<>();
            b.add("");
            return b;
        }
        ArrayList<String> hpath =new ArrayList<>();
        ArrayList<String> vpath =new ArrayList<>();
        if (sc < dc){
            hpath = getMaze(sr,sc + 1,dr,dc);
        }
        if(sr < dr){
            vpath = getMaze(sr+1,sc,dr,dc);
        }
        ArrayList<String> path = new ArrayList<>();
        for(String vpt : vpath){
            path.add("V" + vpt);
        }
        for(String hpt : hpath){
            path.add("H" + hpt);
        }
        return path;
    }
}