// package Recurssion.logPow;

public class logPow {
    public static void main(String[] args) {
        int n=2;
        int m=4;

        int ans=logarithmPow(n, m);

        System.out.println(ans);

    }

    public static int logarithmPow(int n, int m){
        if(m==0){
            return 1;
        }
        if(m==1){
            return n;
        }

        int xpow=logarithmPow(n, m/2);
        int xn=xpow*xpow;

        if(xn%2==1){
            xn=xn*n;
        }

        return xn;
    }
}
