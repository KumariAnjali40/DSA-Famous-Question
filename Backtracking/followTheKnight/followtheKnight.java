package Backtracking.followTheKnight;

import java.util.Scanner;

public class followtheKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[10][10];
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                mat[x][y] = 0;
            }
        }
        knight(i-1,j-1,n,mat);
        int ans=0;
        for(int p=0;p<10;p++){
            for(int q=0;q<10;q++){
                if(mat[p][q]==1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void knight(int i, int j, int n, int[][] mat) {
       if(i<0 || j<0 || i>=10 || j>=10){
           return ;
       }
       if(n==0){
           mat[i][j]=1;
           return ;
       }
        knight(i+2 ,j-1 ,n-1 ,mat);
        knight(i+2 ,j+1 ,n-1 ,mat);
        knight(i-2 ,j-1 ,n-1 ,mat);
        knight(i-2 ,j+1 ,n-1 ,mat);
        knight(i+1 ,j+2 ,n-1 ,mat);
        knight(i-1 ,j+2 ,n-1 ,mat);
        knight(i+1 ,j-2 ,n-1 ,mat);
        knight(i-1 ,j-2 ,n-1 ,mat);
    }
}

