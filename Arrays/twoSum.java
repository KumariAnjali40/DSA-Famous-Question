import java.util.*;

public class twoSum{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int n=4;
        int[] arr = {2, 7, 11, 15};
       int target=9;
       
       int[] ans = twosum(arr, n, target);
       System.out.println(ans[0]+" "+ans[1]);
    }


    //here is my brute force approch for two sum
    public static int [] twosum(int [] arr,int n, int target){
        int [] ans = new int [2];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}