

public class reverseArray {
    public static void main(String [] args){
        
        int n=5;
        int [] arr = {12, 34 ,11, 9, 18};

        int left=0;
        int right=n-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }

    }
}
