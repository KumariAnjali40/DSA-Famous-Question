

public class happyNum {
    public static void main(String [] args){
       
            int n=19;
            
           while(n>4){
               n=happynum(n);
           }
            if(n==1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
    }
    public static int happynum(int n){
        int sum=0;
        
        while(n>0){
            int rem=n%10;
            int squareRem=rem*rem;
            
            sum+=squareRem;
            
            n/=10;
        }
        return sum;
    }
}
