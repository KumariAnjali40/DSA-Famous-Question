import java.util.Stack;

public class encryption {
    public static void main(String[] args) {
        String s="ab#d";

        Stack<Character>st= new Stack<>();
            
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                st.push(ch);
            }else{
                if(!st.isEmpty()){
                st.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        System.out.println(sb.toString());
    }
}
