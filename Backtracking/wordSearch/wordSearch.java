package Backtracking.wordSearch;

public class wordSearch {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;

        String word = "ABCCED";

        char[][] ch = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String ans="NO";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWordExit(ch,i,j,0,n,m,word)){
                    ans="YES";
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean isWordExit(char [][] ch, int row,int col, int idx, int n, int m, String word) {
        if(idx==word.length()){
            return true;
        }
        if(row<0 || col <0 || row>=n || col>=m || ch[row][col]!=word.charAt(idx) || word.charAt(idx)=='@'){
            return false;
        }

        char temp=ch[row][col];
        ch[row][col]='@';

        if(isWordExit(ch, row+1, col, idx+1, n, m, word)) return true;
        if(isWordExit(ch, row-1, col, idx+1, n, m, word)) return true;
        if(isWordExit(ch, row, col+1, idx+1, n, m, word)) return true;
        if(isWordExit(ch, row, col-1, idx+1, n, m, word)) return true;

        ch[row][col]=temp;

        return false;
    }
}
