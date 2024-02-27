// package Recurssion.printIncDec;

public class printIncrDecr {

    public static void main(String[] args) {
        int n=5;

        printIncrDecr(n);
    }
    public static void printIncrDecr(int n){
        if(n==0) return;

        System.out.println(n);
        printIncrDecr(n-1);
        System.out.println(n);
    }
}
