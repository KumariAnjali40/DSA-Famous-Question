package Recurssion.maxOfArray;

public class maxOfArray {
    public static void main(String[] args) {
        int [] arr = {10,20,40,60,30};


       int ans= findMax(arr,0);
       System.out.println(ans);
    }

    public static int findMax(int [] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }

        int misa=findMax(arr, idx+1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
