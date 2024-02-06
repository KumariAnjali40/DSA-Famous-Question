import java.util.*;

public class water{
   
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int n=9;
        int[] arr = {1, 8 ,6, 2, 5, 4, 8, 3, 7};
    
       int  ans = mostWater(arr,n);
       System.out.println(ans);
    }
    public static int mostWater(int [] arr , int n){
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j){
            int hight=Math.min(arr[i],arr[j]);
            int width=j-i;
            int area=width*hight;
            max=Math.max(max,area);
            if(arr[i]<arr[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }

}