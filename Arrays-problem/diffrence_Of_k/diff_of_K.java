

public class diff_of_K {
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int [] arr={1,2,3,4,5};

        int i=0;
            int j=1;
            String ans="No";
            while(j<n && i<n){
                int sum=arr[j]-arr[i];
                if(sum==k && i!=j){
                    ans="Yes";
                    break;
                }else if(sum>k){
                    i++;
                }else{
                    j++;
                }
            }
            System.out.println(ans);

    }
}
