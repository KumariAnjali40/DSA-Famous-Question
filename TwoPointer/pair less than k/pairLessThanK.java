import java.util.*;

public class pairLessThanK {
    public static void main(String [] args){
    
        int n=5;
        int k=7;
        int [] arr = {1, 2 ,3, 4, 5};
        Arrays.sort(arr);
        
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int max=-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<k  && max<sum){
               max=sum;
               left++;
               
            }else{
                right--;
            }
        }
        System.out.println(max);
}
}
