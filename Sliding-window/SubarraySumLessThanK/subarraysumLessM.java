

public class subarraysumLessM {
    
    public static void main(String [] args){
    
        int n=5;
        int m=5;
        int [] arr = {1, 5, 1, 3, 2};

        int left=0;
            int right=0;
            int sum=0;
            long count=0;
            while(right<n){
                sum=sum+arr[right];
                while(sum>=m){
                    sum-=arr[left];
                    left++;
                }
                count+=(right-left+1);
                right++;
            }
            System.out.println(count);
    
    }
}
