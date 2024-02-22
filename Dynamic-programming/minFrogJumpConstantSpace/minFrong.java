// package Dynamic-programming.minFrogJumpConstantSpace;

public class minFrong {
    public static void main(String[] args) {
        int n = 4;
        int[] heights = {10, 20, 30, 10};


        int result = frogJump(n, heights);
        System.out.println(result); 
    }

    public static int frogJump(int n, int [] arr){
        int prev=0;
        int prev1=0;

        for(int i=1;i<n;i++){
            
            int left=prev+Math.abs(arr[i-1]-arr[i]);

            int right=Integer.MAX_VALUE;

            if(i>1){
                right = prev1+Math.abs(arr[i-2]-arr[i]);
            }

            int curr=Math.min(left,right);
            prev1=prev;
            prev=curr;
        }
        return prev;
    }
}
