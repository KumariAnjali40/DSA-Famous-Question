

public class gcd {
    public static void main(String[] args) {
        int a=6;
        int b=9;

        System.out.println(gcdd(a,b));
    }
public static int gcdd(int a,int b){
    if(b!=0){
        return gcdd(b,a%b);
    }else{
        return a;
    }
}
}
