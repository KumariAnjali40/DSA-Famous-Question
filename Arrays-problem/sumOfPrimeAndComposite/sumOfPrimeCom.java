// package Arrays-problem.sumOfPrimeAndComposite;

public class sumOfPrimeCom {
    public static void main(int rows, int cols,int[][] mat){
        //write your code here
        // int prime =0;
        int sum=0;
        int dif=0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int count=0;
                if(mat[i][j]==0|| mat[i][j]==1) continue;
                for(int k=2;k<=mat[i][j]/2;k++){
                    if(mat[i][j]%k==0){
                        count++;
                    }
                }
                
                if(count==0){
                    sum+=mat[i][j];
                }else{
                    dif+=mat[i][j];
                }
            }
        }
        System.out.println(Math.abs(sum-dif));
        
      }
    
}
