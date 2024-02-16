package Binary_search.singleElementInSortedArray;

public class singleNonDuplicate {
    public static void main(String[] args) {
        int n=9;
        int [] arr = {1,1,2,3,3,4,4,8,8};

        int ans=search(arr,n);

        System.err.println(ans);
    }

    public static int search(int [] nums, int n) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
 
            boolean isEven=false;
 
            if((high-mid)%2==0){
                isEven=true;
            }
 
            if(nums[mid]==nums[mid+1]){
              if(isEven){
                  low=mid+2;
              }else{
                  high=mid-1;
              }
            }else{
                if(isEven){
                    high=mid;
                }else{
                 low=mid+1;
                }
            }
        }
        return nums[high];
    }
}
