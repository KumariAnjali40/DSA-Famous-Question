import java.util.*;

class teamOfHeros{
    public static void main(String [] args){
    
            int n=5;
            int target=31;
            int [] arr = {10, 11 ,13, 17, 21};
            Arrays.sort(arr);
            
            int left=0;
            int right=n-1;
            String ans="No";
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==target){
                    ans="Yes";
                    break;
                }else if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
            System.out.println(ans);
    }
}