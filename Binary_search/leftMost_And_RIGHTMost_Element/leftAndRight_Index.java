package Binary_search.leftMost_And_RIGHTMost_Element;

public class leftAndRight_Index {
    public static void main(String[] args) {
       int n=6;
       int target=8;
       int [] arr={5,7,7,8,8,10};

       int [] ans=new int [2];

       ans[0]=left(arr,target,n);
       ans[1]=right(arr,target,n);

       System.out.println(ans[0]+" "+ans[1]);

    }
    public static int left(int [] arr, int target, int n){
        int low=0;
      
       int high=n-1;
       int ans=-1;

       while(low<=high){
           int mid=low+(high-low)/2;

           if(arr[mid]==target){
               ans=mid;
               high=mid-1;
           }else if(arr[mid]<target){
               low=mid+1;
           }else{
               high=mid-1;
           }
       }
       return ans;
   }

   public static int right(int [] arr, int target, int n){
        int low=0;

       int high=n-1;
       int ans=-1;

       while(low<=high){
           int mid=low+(high-low)/2;

           if(arr[mid]==target){
               ans=mid;
                low=mid+1;
           }else if(arr[mid]<target){
               low=mid+1;
           }else{
               high=mid-1;
           }
       }
       return ans;
   }
}
