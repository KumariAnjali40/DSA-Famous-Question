// package Dynamic-programming.minFrogJump;

public class minFrogJump {
    public static void main(String[] args) {
        int n = 4;
        int[] heights = {10, 20, 30, 10};

        int [] dp = new int [n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }

        int result = frogJump(n, heights,n-1, dp);
        System.out.println(result); 
    }
    public static int frogJump(int n, int [] arr, int ind, int [] dp) {
        if(ind==0){
            return 0;
        }

        if(dp[ind]!=-1){
            return dp[ind];
        }

        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;

        if(ind-1>=0){
            left=frogJump(n, arr, ind-1, dp)+Math.abs(arr[ind-1]-arr[ind]);
        }

        if(ind-2>=0){
            right= frogJump(n, arr, ind-2, dp)+Math.abs(arr[ind-2]-arr[ind]);
        }

        dp[ind]=Math.min(left,right);

        return dp[ind];
    }
}
