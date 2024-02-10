

public class maxSumSubarraySizeK {
    public static void main(String [] args){
    
        int n=4;
        int k=4;
        int [] arr = {100,200,300,400};

        int left=0;
        int right=0;
        int sum=0;
        int max=Integer.MIN_VALUE;

        while(right<n){
            sum+=arr[right];
            if(right-left+1==k){
                if(sum>max){
                    max=sum;
                }
                sum-=arr[left];
                left++;
            }
            right++;
        }
       System.out.println(max);
    }
}
