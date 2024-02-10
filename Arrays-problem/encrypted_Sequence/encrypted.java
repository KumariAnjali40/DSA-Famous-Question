

public class encrypted {
    public static void main(String [] args){
       
        int n=5;
        int [] arr = {1,3 , 5, 4, 2};
        
        encrypted(arr,n);
            
    }
public static void encrypted(int [] arr, int n){
    StringBuilder sb=new StringBuilder();
    int [] res=new int[n];
    int i=0;
    int j=n-1;
    int k=0;
    while(i<=j){
        res[k]=arr[i];
        i++;
        k++;
        if(i<j){
            res[k]=arr[j];
            
            k++;
            j--;
        }
    }
    for(int x=0;x<n;x++){
        sb.append(res[x]+" ");
    }
    System.out.println(sb);
}
}
