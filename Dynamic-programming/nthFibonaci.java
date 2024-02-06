import java.util.*;

public class nthFibonaci {
    public static void main(String [] args){
        
        int n = 9 ;

        System.out.println(fib1(n));

        int [] dp= new int [n+1]; // 1 extra for handle the case n=0;
         
        for(int i=0; i<= n ;i++){
            dp[i] = -1;
        }
        
        int ans=fib2(n,dp);
        System.out.println(ans);
    }

    //This is Recurssive approach . Time complexity: Exponential .every funciton called two other function.
    public static int fib1 (int n){
        
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fib1(n-1)+fib1(n-2);
    }

    //as we know many time fib(n-1) and fib(n-2) value is repeating so we can store that value in an dp array and use that sotre value .
    
    //Dynamic program approach O(n);

    public static int fib2(int n, int [] dp){
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fib2(n - 1, dp) + fib2(n - 2, dp);

        return dp[n];
    }
}
