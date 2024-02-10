

import java.util.Stack;

public class SNG {
    public static void main(String[] args) {
        int n=8;

        int [] arr= {39,27,11,4,24,32,32,1};

        int [] res=new int [n];
        
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            if(!st.isEmpty()){
                res[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
