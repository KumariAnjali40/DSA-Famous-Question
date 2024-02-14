// package Arrays-problem.Minimize_The_Height;

import java.util.Arrays;

public class minimizeTheHeight {
    public static void main(String[] args) {
        int k=2;
        int n=4;

        int [] arr ={1,5,8,10};

        Arrays.sort(arr);
       
        int ans=arr[n-1]-arr[0];
        
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n-1;i++){
            min=Math.min(smallest,arr[i+1]-k);
            max=Math.max(largest,arr[i]+k);
            
            if(min<0){
                continue;
            }
            ans=Math.min(ans,max-min);
        }
        
       System.out.println(ans);
    }
}
