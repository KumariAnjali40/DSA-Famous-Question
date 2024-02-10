

import java.util.Stack;

public class validStackSequnce {
    public static void main(String[] args) {
        int n=5;
        int [] push={1,2,3,4,5};
        int [] pop={4,5,3,2,1};

        boolean ans=validStack(push,pop,n);
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

    public static boolean validStack(int [] push, int [] pop,int n){
       
       Stack<Integer>st=new Stack<>();

        int j=0;
        for(int i=0;i<n;i++){
        st.push(push[i]);
        while(!st.isEmpty() && st.peek()==pop[j]){
            st.pop();
            j++;
           }
        }
        return st.isEmpty();
    }
}
