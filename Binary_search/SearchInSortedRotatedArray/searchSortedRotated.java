package Binary_search.SearchInSortedRotatedArray;

public class searchSortedRotated {
    public static void main(String[] args) {
        int n=7;
        int [] arr = {4,5,6,7,0,1,2};
        int target=0;

        int ans=search(arr, n,target);

        System.err.println(ans);
    }
    public static int search(int[] nums,int n, int target) {
          int pivot_index=findPivot(nums);
          
          int idx=binarySearch(nums, 0, pivot_index-1, target);
  
          if(idx!=-1){
              return idx;
          }
  
          idx=binarySearch(nums,pivot_index,n-1,target);
  
          return idx;
  
      }

      public static int binarySearch(int [] nums, int low,int high, int target){

        int ans=-1;

     while(low<=high){
         int mid=low+(high-low)/2;

         if(nums[mid]==target){
             ans=mid;
             high=mid-1;
         }else if(nums[mid]<target){
             low=mid+1;
         }else{
             high=mid-1;
         }
     }
     return ans;
 }



  public static int findPivot(int [] nums){
      int low=0;
      int high=nums.length-1;
      while(low<high){
          int mid=low+(high-low)/2;
          if(nums[mid]<nums[high]){
              high=mid;
          }else{
              low=mid+1;
          }
      }
      return high;
  }
}
