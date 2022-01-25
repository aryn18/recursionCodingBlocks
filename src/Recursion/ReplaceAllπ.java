package Recursion;

import java.util.Scanner;

public class ReplaceAllπ {
    public static void convert(String inp,String con){
        if(inp.length()==0){
            System.out.println(con);
            return;
        }
        char cc0th;
        char cc1th=' ';
        if(inp.length()>=2){
            cc0th=inp.charAt(0);
            cc1th=inp.charAt(1);
        }
        cc0th=inp.charAt(0);
        if(cc0th=='p' && cc1th=='i'){
            convert(inp.substring(2),con+"3.14");
        }
        else{
            convert(inp.substring(1),con+cc0th);
        }
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            String str=sc.nextLine();
            convert(str,"");
        }
    }

}
