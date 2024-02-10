import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        String s="{([])}" ;

        boolean ans=solve(s);
            if(ans){
                System.out.println("balanced");
            }else{
                System.out.println("not balanced");
            }
    }

     public static boolean solve(String s){
        Stack<Character>st = new Stack<>();
            
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='['){
                    st.push(ch);
                }else{
                    
                    if(st.isEmpty()){
                        return false;
                    } 
                    if(ch==')' && st.peek()!='('){
                        return false;
                    }
                    if(ch=='}' && st.peek()!='{'){
                        return false;
                    }
                    if(ch==']' && st.peek()!='['){
                        return false;
                    }
                    st.pop();
                }
            }
            
       return st.isEmpty();
    }
}
