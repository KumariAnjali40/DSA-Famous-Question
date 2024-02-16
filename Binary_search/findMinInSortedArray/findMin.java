// package Binary_search.findMinInSortedArray;

public class findMin {
    public static void main(String[] args) {
        int n=5;
        int [] arr = {3,4,5,1,2};

        int low=0;
        int high=n-1;

        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]> arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        System.out.println(arr[high]);
    }
}
