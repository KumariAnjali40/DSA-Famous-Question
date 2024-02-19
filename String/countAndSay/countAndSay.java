package String.countAndSay;

public class countAndSay {
    public static void main(String[] args) {
        int n=4;

         String ans=countSay(n);

         System.out.println(ans);
    }

    public static String countSay(int n){
        if(n==1){
            return "1";
        }

        String say=countSay(n-1);

        String str="";

        for(int i=0;i<say.length();i++){
            char ch=say.charAt(i);
            
            int count=1;

            while(i<say.length()-1 && say.charAt(i)==say.charAt(i+1)){
                 count++;
                 i++;
            }

            str+=String.valueOf(count)+say.charAt(i);
        }

        return str;
    }
}
