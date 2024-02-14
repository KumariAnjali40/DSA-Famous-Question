// package Arrays-problem.KthSmallestElement;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int n=6;
        int k=3;
        
        int [] arr ={7,10,4,3,20,15};

        Arrays.sort(arr);


        System.out.println(arr[k-1]);
        
    }
}
