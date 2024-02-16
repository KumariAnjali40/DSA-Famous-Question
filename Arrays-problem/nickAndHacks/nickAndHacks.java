import java.util.*;

public class nickAndHacks {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        
        int tc=sc.nextInt();
        while(tc-->0){
            double n=sc.nextDouble();
            double k=1;
            
            boolean ans= nickHacks(n,k);
            if(ans){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean nickHacks(double n, double k){
        if(n==k){
            return true;
        }
        if(n<k){
            return false;
        }else{
        return nickHacks(n,k*10) || nickHacks(n,k*20);
        }
    }
}
