import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int n=4;
        int [] arr = {1,3,2,4};


        int [] res = new int [n];
            
            Stack<Integer>st = new Stack<>();
            
            for(int i=n-1;i>=0;i--){
    
                while(!st.isEmpty() && st.peek()<=arr[i]){
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
