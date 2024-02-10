

public class gcd {
    public static void main(String[] args) {
        int a=6;
        int b=9;

        System.out.println(gcd(a,b));
    }
public static int gcd(int a,int b){
    if(b!=0){
        return gcd(b,a%b);
    }else{
        return a;
    }
}
}
