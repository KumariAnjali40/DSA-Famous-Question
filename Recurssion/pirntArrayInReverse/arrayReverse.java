package Recurssion.pirntArrayInReverse;

public class arrayReverse {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,60};

        display(arr,0);
    }

    public static void display(int [] arr, int idx){
        if(arr.length==idx) return ;

        display(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
