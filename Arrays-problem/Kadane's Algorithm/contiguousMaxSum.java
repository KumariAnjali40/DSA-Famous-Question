// package Arrays-problem.Kadane's Algorithm;

public class contiguousMaxSum {
    public static void main(String[] args) {
        int n=5;
        int [] arr = {1,2, 3, -2,5};

        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
