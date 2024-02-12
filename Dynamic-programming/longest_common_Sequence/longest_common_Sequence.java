// package Dynamic-programming.longest_common_Sequence;

import java.util.Arrays;

public class longest_common_Sequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2= "ace" ;


        //for top down
        int [] [] dp= new int [s1.length()][s2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        

        int ans=solve(s1,s2,0,0);

        System.out.println(ans);

        int result=dpSol(s1,s2,0,0,dp);
        System.out.println(result);
    }

    //recurssion
    public static int solve(String s1,String s2,int i, int j){
         
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solve(s1, s2, i+1, j+1);
        }else{
            return Math.max(solve(s1, s2, i+1, j),solve(s1, s2, i, j+1));
        }
    }

    //dp(top down);
    public static int dpSol(String s1,String s2,int i, int j, int [] [] dp){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+dpSol(s1, s2, i+1, j+1, dp);
        }else{
           
            dp[i][j]= Math.max(dpSol(s1, s2, i+1, j, dp), dpSol(s1, s2, i, j+1, dp));
        }

        return dp[i][j];
    }

}
