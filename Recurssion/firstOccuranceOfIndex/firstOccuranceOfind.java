// package Recurssion.firstOccuranceOfIndex;

import java.util.Arrays;

public class firstOccuranceOfind {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,3,4,9};

        int k=3;
        //  Arrays.sort(arr);
        int ans=first(arr,k,0);
        System.out.println(ans);
    }

    public static int first(int [] arr, int k,int idx){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==k){
            return idx;
        }else{
            int fi=first(arr, k, idx+1);
            return fi;
        }

       
    }
}
