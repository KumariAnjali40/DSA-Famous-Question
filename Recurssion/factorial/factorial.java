

public class factorial {
    public static void main(String[] args) {
        int n=5;

        //5*4*3*2*1
        int ans=fib(n);
        System.out.println(ans);
    }
    public static int fib(int n){
       if(n==0 || n==1) return 1;

       return n*fib(n-1);
    }
}
