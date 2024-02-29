package Backtracking.numberOfWays;


import java.util.*;
class numOfWay{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=ways(n);
        System.out.print(ans);
    }
    public static int ways(int n){
        if(n<0) return 0;
        if(n==0) return 1;
         return ways(n-1)+ways(n-2)+ways(n-3);
    }
}