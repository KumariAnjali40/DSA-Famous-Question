package Recurssion.StringLength;

import java.util.Scanner;

public class stringlength {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        String s= sc.next();
        
        int ans=stringLength(s);
        
        System.out.println(ans);
    }
    public static int stringLength(String s){
        if(s.equals("")) return 0;
        
        return stringLength(s.substring(1))+1;
    }
}
