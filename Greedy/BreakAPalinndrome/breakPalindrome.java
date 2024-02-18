package Greedy.BreakAPalinndrome;

public class breakPalindrome {
    public static void main(String[] args) {
        String palindrome="abccba";

        String ans=palindromeBreak(palindrome);

        System.out.println(ans);


    }
    public static String palindromeBreak(String palindrome) {
        int n = palindrome.length();
        char[] res = palindrome.toCharArray();
        if(n <= 1) return "";
        for(int i = 0; i < n / 2; ++i){
            if(res[i] != 'a'){
                res[i] = 'a';
                return String.valueOf(res);
            }
        }
        res[n - 1] = 'b';
        return String.valueOf(res);
    }
}
