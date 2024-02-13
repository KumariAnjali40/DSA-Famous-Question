// package House_Robber;

import java.util.Arrays;

//why dp?? 
// 1)==> we have options in this question like either we can steal or we can't .
//2)==> we have to find min/max ==> in this question we have to find max 
//3)==> we have overlapping sub problems let's take an example


    //              ( 1    2    3    1)
    //               /                 \
    //     take 1   /                   \  not take 1,
    //           (3,1)                 (2,3,1)
    //            /\ not take       take  / \not take 2,
    //  take 3   /  \                    /   \
    //        ()      (1)               (1)   (3,1)
  
    //   so as we can see here overlapping subproblem because 1, (3,1) is repeating . so we use dp here we will store value in an array whenever we find any overlapping subproblem insted of calculatin that again we will directly use that sotre value.
     
 


public class houseRobber {
    public static void main(String[] args) {
        int n=4;
        int [] arr ={1,2,3,1} ; 

        int [] dp=new int [n+1];
        Arrays.fill(dp,-1);

        int ans=rec(arr,n,0,dp);
        System.out.println(ans);

        int ans2=bottomUp(arr,n,dp);
        System.out.println(ans2);
    }

    public static int rec(int [] arr, int n, int index,int [] dp){
        if(index>=n){
            return 0;
        }

        if(dp[index]!=-1){
            return dp[index];
        }
        int take=arr[index]+rec(arr,n,index+2,dp);
        int nottake=rec(arr,n,index+1,dp);

         dp[index]=Math.max(take,nottake);

        return dp[index];
    }


    //let come to bottom up approach .

    // dp[i]=mex stolen memory till house i.
    // dp[0]=max profit till house 0 means 0;
    public static int bottomUp(int [] arr, int n,int [] dp){
        dp[0]=0;
        dp[1]=arr[0];

        for(int i=2;i<=n;i++){
            int steal=arr[i-1]+dp[i-2];
            int skip=dp[i-1];

            dp[i]=Math.max(steal,skip);
        }

        return dp[n];

    }
    
}



