package Binary_search.findKRotation;

public class findKRotation {
    public static void main(String[] args) {
        int n=5;
        int [] arr = {5,1,2,3,4};

        int ans=kRotation(arr,n);
        System.err.println(ans);
    }

    public static int kRotation(int [] arr, int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[high]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}
