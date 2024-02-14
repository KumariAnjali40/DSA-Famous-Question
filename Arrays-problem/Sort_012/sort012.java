// package Arrays-problem.Sort_012;

public class sort012 {
    public static void main(String[] args) {
        int n=5;
        int [] a ={0,2,1,2,0};

        int c1=0;
        int c2=0;
        int c3=0;
        
        for(int i=0;i<n;i++){
            if(a[i]==0) c1++;
            else if(a[i]==1) c2++;
            else c3++;
        }
        
        int k=0;
        for(int i=0;i<c1;i++) a[k++]=0;
        for(int i=0;i<c2;i++) a[k++]=1;
        for(int i=0;i<c3;i++) a[k++]=2;
        
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
