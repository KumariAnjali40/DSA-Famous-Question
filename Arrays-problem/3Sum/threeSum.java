// package Arrays-problem.3Sum;

import java.util.Arrays;



public class threeSum {
    public static void main(String[] args) {
        int n=4;
        int [] arr = {-1,2,1,-4};

        int target=1;

        Arrays.sort(arr);

        int ans=solve(arr,n, target);
        System.out.println(ans);
    }
    public static int solve(int [] arr, int n, int target) {

        int max=100000;

        for(int k=0;k<=n-3;k++){
            
            int i=k+1;
            int j=n-1;

            while(i<j){
                int sum=arr[i]+arr[j]+arr[k];

                if(Math.abs(target-sum)<Math.abs(target-max)){
                    max=sum;
                }

                if(sum<target){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return max;
        
    }
}
