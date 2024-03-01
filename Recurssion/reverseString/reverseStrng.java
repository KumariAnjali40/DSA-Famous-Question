package Recurssion.reverseString;

public class reverseStrng {
    public static void main(String[] args) {
        String s = "abcdef";

        String rev = reverseString(s);

        System.out.println(rev);
    }

    public static String reverseString(String s){
        if(s.isEmpty() || s.length()==1){
            return s;
        }else{
            return reverseString(s.substring(1))+s.charAt(0);
        }
    }
}
