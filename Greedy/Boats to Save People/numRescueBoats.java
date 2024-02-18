// package Greedy.Boats to Save People;

import java.util.Arrays;

public class numRescueBoats {
    public static void main(String[] args) {
        int n=4;
        int [] arr= {3,5,3,4};

        int limit =5;
        Arrays.sort(arr);

        int ans=boat(arr,n,limit);

        System.out.println(ans);
    }

    public static int boat(int [] arr, int n, int limit){
        int i=0;
        int j= n-1;
        int count=0;

        while(i<=j){
            if(arr[i]+arr[j]<=limit){

                i++;
                j--;
            }else{
                j--;
            }

            count++;
        }

        return count;
    }
}
