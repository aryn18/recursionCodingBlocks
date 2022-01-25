package Recursion;

import java.util.Scanner;

public class MoveAllXatEnd {
    static int x=0;
    public static void move(String inp,String con){
        if(inp.length()==0){
            while(x>0){
                con+='x';
                x--;
            }
            System.out.println(con);
            return;
        }
        char cc0th=inp.charAt(0);
        if(cc0th=='x'){
            x++;
            move(inp.substring(1),con);
        }
        else
            move(inp.substring(1),con+cc0th);
    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        move(str,"");
    }

}
