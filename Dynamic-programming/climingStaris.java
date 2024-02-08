public class climingStaris {
    public static void main(String [] args){
        int n=4;
        int ans=stairRec(n);
        
        System.out.println(ans);

        int res=stairDp(n);
        System.out.println(res);
    }

    public static int stairRec(int n){
        if(n<=1){
            return 1;
        }

        return stairRec(n-1)+stairRec(n-2);
    }
    
    public static int stairDp(int n){
        int [] dp=new int [n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

}
