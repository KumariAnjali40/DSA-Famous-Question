package Recurssion.SuperDigit;


import java.util.*;
public class superDigit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
       int result = superDigit(n, k);
       System.out.println(result);
    }
 public static int superDigit(String n,int k){
        long digitSum =0;
        for(char digit : n.toCharArray()){
            digitSum += Character.getNumericValue(digit);
        }
        long result =digitSum*k;
        while(result>=10){
            long temp = 0;

            while(result>0){
                
                temp +=result % 10;
                result/= 10;
            }
            result = temp;
        }
        return (int)result;
}  
}
