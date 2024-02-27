package Recurssion.printZigZag;

public class printzigzag {
    public static void main(String[] args) {
        int n=2;

        zigzag(n);
    }

    public static void zigzag(int n){
        if(n==0) return ;

        System.out.print(n+" ");
        zigzag(n-1);
        System.out.print(n+" ");
        zigzag(n-1);
        System.out.print(n+" ");
    }
}
