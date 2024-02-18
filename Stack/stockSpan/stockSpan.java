package Stack.stockSpan;

import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        
        int n=6;
        int [] arr = {10,4,5,90,120,80};
      
        int [] ans=span(arr, n);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    public static int[] span(int [] arr, int n){
        int [] ans= new int [n];
        Stack<Integer>st = new Stack<>();

        st.push(0);

        ans[0]=1;

        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=i+1;
            }else{
                ans[i]=i-st.peek();
            }

            st.push(i);
        }
        
        return ans;

    }
}
