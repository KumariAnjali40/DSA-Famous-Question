package Recurssion.printDecreasing;

public class printDecreasing {
    public static void main(String[] args) {
        int n=5;

        printDecreas(n);
    }

    public static void printDecreas(int n){
        if(n==0) return;

        System.out.println(n);
        printDecreas(n-1);
    }
}
