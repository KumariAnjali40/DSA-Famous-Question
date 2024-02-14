// package Arrays-problem.cyclically_rotate_array;

// Given an array, rotate the array by one position in clock-wise direction.


public class cyclicallyRotate {
    public static void main(String[] args) {
        int n=5;
        int [] arr={1,2,3,4,5};

        int temp=arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }

        arr[0]=temp;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
