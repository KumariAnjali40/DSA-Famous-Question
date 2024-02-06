import java.util.*;

public class rainWater{
   
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int n=6;
        int[] arr = {4,2,0,3,2,5};
    
       int  ans = trappingWater(arr,n);
       System.out.println(ans);
    }

    public static int trappingWater(int [] arr, int n){
        int [] leftMax=new int [n];
        int [] rightMax=new int [n];
        
        if(n==0) return 0;

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int sum=0;
        for(int i=1;i<n;i++){
            int h=Math.min(leftMax[i],rightMax[i])-arr[i];
             sum += h;
        }
        return sum;
    }
}