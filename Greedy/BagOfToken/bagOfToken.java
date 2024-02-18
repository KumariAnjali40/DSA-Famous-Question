// package Greedy.BagOfToken;

import java.util.Arrays;

public class bagOfToken {
    public static void main(String[] args) {
        int n=4;
        int [] arr = {100,200,300,400};
        int power=200;

        int ans=token(arr,n, power);
        System.out.println(ans);
    }

    public static int token(int [] arr, int n, int power) {
        Arrays.sort(arr);
        int maxScore=0;
        int i=0;
        int j=n-1;

        int score=0;

        while(i<=j){
            if(power>=arr[i]){
                power-=arr[i];
                score++;
                i++;

                maxScore=Math.max(maxScore, score);
            }else if(score>=1){
                power+=arr[j];
                score--;
                j--;
            }else{
                return maxScore;
            }
        }
        return maxScore;
    }
}
