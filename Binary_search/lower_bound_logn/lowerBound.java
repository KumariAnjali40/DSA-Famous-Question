package Binary_search.lower_bound_logn;

/**
 * lowerBound
 */
public class lowerBound {
  public static void main(String[] args) {
    int n=5;
    int k=2;
    int [] arr = {1,1,2,2,5};

    int ans=lowerBound(arr,n,k);
    System.out.println(ans);
}
public static int lowerBound(int []arr,int n,int k){
    int ans=-1;
    int left=0;
    int right=n-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==k){
            ans=mid;
           right=mid-1;
        }else if(arr[mid]>k){
           right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return ans;
  }
    
}