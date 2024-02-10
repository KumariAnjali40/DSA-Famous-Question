

public class maxSubOfSizeK {
    public static void main(String[] args) {
        int n=10;
        int k=3;
        int [] arr ={-1,-1,-2,1,-2,4,1,9,3,9};

        int i=0;
        int j=0;
        int sum=0;
        int max=0;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1==k){
                if(sum>max){
                    max=sum;
                }
                sum-=arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}
