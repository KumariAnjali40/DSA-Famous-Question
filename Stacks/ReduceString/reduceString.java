import java.util.Stack;

public class reduceString {
    public static void main(String[] args) {
        String s= "aaabccddd";

        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(!st.isEmpty() && ch==st.peek()){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
             sb.insert(0,st.pop());
        }
        
        if(sb.length()==0){
            System.out.println("Empty String");
        }else{
            System.out.println(sb.toString());
        }
    }
}
