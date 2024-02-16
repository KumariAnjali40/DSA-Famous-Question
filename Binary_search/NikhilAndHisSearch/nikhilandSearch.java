package Binary_search.NikhilAndHisSearch;

import java.util.Arrays;
import java.util.Scanner;

public class nikhilandSearch {
     public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int q = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while (q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int count = 0;

            if (x == 0) {
                int low = 0, high = n - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (arr[mid] >= y) {
                        count = n - mid;
                        high = mid - 1; 
                    } else {
                        low = mid + 1; 
                    }
                }
            } else if (x == 1) {
                int low = 0, high = n - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (arr[mid] > y) {
                        count = n - mid;
                        high = mid - 1; 
                    } else {
                        low = mid + 1; 
                    }
                }
            }
             sb.append(count).append("\n");
        }
         System.out.print(sb.toString());
}
}
