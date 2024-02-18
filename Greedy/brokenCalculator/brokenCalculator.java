package Greedy.brokenCalculator;

public class brokenCalculator {
    public static void main(String[] args) {
        int startValue=5;

        int target=8;

        int ans=brokenCalc(startValue,target);

        System.out.println(ans);
    }

    public static int brokenCalc(int startValue, int target){

        if(startValue>=target){
            return startValue-target;
        }

        if(target%2==0){
            return 1+brokenCalc(startValue, target/2);
        }

        return 1+brokenCalc(startValue, target+1);
    }
}
