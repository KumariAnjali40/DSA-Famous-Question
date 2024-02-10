
public class powerFn {
    public static void main(String[] args) {
        int n=2;
        int m=4;

         
        int ans=pow(n,m);
        System.out.println(ans);
    }
    public static int pow(int n, int m){
        if(m==0){
            return 1;
        }
        if(m==1){
            return n;
        }
        
        return n*pow(n,m-1);
    }
}
