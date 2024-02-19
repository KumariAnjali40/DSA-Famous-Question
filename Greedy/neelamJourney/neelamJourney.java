package Greedy.neelamJourney;

public class neelamJourney {
    public static void main(String[] args) {
        int n=5;
        int [] arr ={4,7,8,3,4};

        int sum=0;
        int cost=arr[0];

        for(int i=0;i<n;i++){
            if(cost>arr[i]){
                cost=arr[i];
            }
            sum+=cost;
        }
        System.out.println(sum);
    }
}
