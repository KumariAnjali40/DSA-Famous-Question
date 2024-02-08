public class sumSubarray2{
    public static void main(String [] args){
    
        int n=5;
        int k=3;
        int [] arr = {1, 2 ,1, 3, 4};


        int low=0;
           int high=0;
           long sum=0;
           String ans="No";
           while(high<n){
               sum=sum+arr[high];
               while(sum>k){
                   sum-=arr[low];
                   low++;
               }
               if(sum==k){
                   ans="Yes";
                   break;
               }else if(sum<k){
                   high++;
               }
           }
            System.out.println(ans);

    }
}