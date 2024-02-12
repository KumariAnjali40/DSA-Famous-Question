// package Dynamic-programming.longest_common_Sequence;

public class longest_common_Sequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2= "ace" ;

        int ans=solve(s1,s2,0,0);

        System.out.println(ans);
    }
    public static int solve(String s1,String s2,int i, int j){
         
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+solve(s1, s2, i+1, j+1);
        }else{
            return Math.max(solve(s1, s2, i+1, j),solve(s1, s2, i, j+1));
        }
    }
}
