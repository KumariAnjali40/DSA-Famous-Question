package Binary_search.SearchIn2DMatrix;

public class searchIn2DMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int target=3;
        int[][] arr = {
          {1, 3, 5, 7},
           {10, 11, 16, 20},
          {23, 30, 34, 60}
        };
        
        boolean ans=search(arr, n, m, target);
        if(ans){
              System.out.println("Yes");
        }else{
            System.out.println("No");
        }

}
public static boolean search(int [][] arr , int n, int m,int target) {
    int low=0;
    int high=n*m-1;

    while(low<=high){
        int mid=low+(high-low)/2;

        if(arr[mid/m][mid%m]>target){
           high=mid-1;
        }else if(arr[mid/m][mid%m]<target){
            low=mid+1;
        }else{
            return true;
        }
    }
    return false;
}
}
