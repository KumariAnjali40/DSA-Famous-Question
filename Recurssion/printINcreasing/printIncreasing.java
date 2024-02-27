package Recurssion.printINcreasing;

public class printIncreasing {
    public static void main(String[] args) {
        int n=5;

        printIncr(n);
    }

    public static void printIncr(int n){
        if(n==0) return;


        printIncr(n-1);
        System.out.println(n);
    }
}
