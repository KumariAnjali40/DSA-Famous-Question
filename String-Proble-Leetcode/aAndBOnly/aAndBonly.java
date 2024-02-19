// package String-Proble-Leetcode.aAndBOnly;


public class aAndBonly {
    public static void main(String[] args) {
       String s="?ba??b";

       char [] ch =s.toCharArray();

       for(int i=0;i<s.length();i++){

        if(ch[i]=='?'){
            
            char prev = ' ';

            if(i>0){
                prev=ch[i-1];
            }
            char nextChar=' ';

            if(i<s.length()-1){
                nextChar=ch[i+1];
            }

            if(prev!='a' && nextChar!='a'){
                ch[i]='a';
            }else{
                ch[i]='b';
            }
        }

       }
       System.out.println(new String(ch));
    }
}
