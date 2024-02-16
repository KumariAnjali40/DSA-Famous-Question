package Recurssion.numOfWays;

import java.util.Scanner;

public class numOfWays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int ans=numWays(n);
        System.out.println(ans);
    }
    
    public static int numWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        
        return numWays(n-1)+numWays(n-2)+numWays(n-3);
    }
}
