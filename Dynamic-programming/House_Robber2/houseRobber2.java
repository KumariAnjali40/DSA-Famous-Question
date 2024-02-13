// package Dynamic-programming.House_Robber2;

import java.util.Arrays;

public class houseRobber2 {
    public static void main(String[] args) {
        
        int n=4;
        int [] arr ={1,2,3,1};


        if(n==0){
            System.out.println(0);
        }
        if(n==1){
            System.out.println(arr[0]);
        }

        if(n==2){
            System.out.println(Math.max(arr[0],arr[1]));
        }

        int [] dp = new int [n+1];
        Arrays.fill(dp, -1);

        int take_0th_index=solve(arr,0,n-2,dp);

        Arrays.fill(dp, -1);
        int take_1st_index=solve(arr,1,n-1,dp);

        int ans=Math.max(take_0th_index,take_1st_index);

        System.out.println(ans);

    }

    public static int solve(int [] arr, int start, int n, int [] dp){
        if(start>n){
            return 0;
        }

        if(dp[start]!=-1){
            return dp[start];
        }

        int take=arr[start]+solve(arr, start+2, n, dp);
        int nottake=solve(arr, start+1, n, dp);

        dp[start]=Math.max(take,nottake);

        return dp[start];
    }
}
