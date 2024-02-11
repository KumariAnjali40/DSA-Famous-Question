package Binary_search.upper_Bound_Logn;

public class upperBound {
    public static void main(String[] args) {
        int n=10;
        int k=3;

        int [] arr = {0,2,4,4,5,5,7,7,9,10};

        int ans=upperBound(arr,n,k);
        System.out.println(ans);
    }
    public static int upperBound(int []arr,int n,int k){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                low=mid+1;
            }else if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
