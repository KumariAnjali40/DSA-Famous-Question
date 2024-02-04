import java.util.*;

public class twoSum2{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int n=4;
        int[] arr = {2, 7, 11, 15};
       int target=9;
       
       int[] ans = twoSum(arr, n, target);
       System.out.println(ans[0]+" "+ans[1]);
    }
 
    public static int[] twoSum(int[] nums,int n, int target) {
        int l = 0, r =  n-1;
        
        while (nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] < target) l++;
            else r--;
        }
    
        return new int[] {l+1, r+1};
    }
}