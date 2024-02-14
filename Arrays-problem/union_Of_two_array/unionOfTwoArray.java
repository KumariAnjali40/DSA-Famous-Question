// package Arrays-problem.union_Of_two_array;

import java.util.HashSet;

public class unionOfTwoArray {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        int [] a={1,2,3,4,5};

        int [] b={1,2,3};

         
        HashSet<Integer>set = new HashSet<>();
        
        for(int i=0;i<n;i++){
             set.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            if (!set.contains(b[i])) {
            set.add(b[i]);
            }
        }
        
     int count=set.size();
     
      System.out.println(count);
    }
}
