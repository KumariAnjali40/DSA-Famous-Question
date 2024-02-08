import java.util.*;

public class medicine {
    public static void main(String [] args){
    
        int n=5;
        int target=7;
        int [] arr = {1, 2 ,3, 4, 5};
        Arrays.sort(arr);
        
        int left=0;
        int right=n-1;
        String ans="Impossible";
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                ans="Possible";
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
