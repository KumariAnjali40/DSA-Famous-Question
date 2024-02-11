
package Backtracking.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class combination {

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[] arr = {1, 2, 3, 4};

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        combinationSum(arr, n, k, 0, list, res);


        for (List<Integer> combination : res) {
            System.out.println(combination);
        }
    }

    public static void combinationSum(int[] arr, int n, int k, int idx, List<Integer> list, List<List<Integer>> res) {
        if (k == 0) {
            res.add(new ArrayList<>(list));  
            return;
        }

        if (idx == n) {
            return;
        }

        // Include the current element
        list.add(arr[idx]);
        combinationSum(arr, n, k - 1, idx + 1, list, res);
        list.remove(list.size() - 1);

        // Exclude the current element
        combinationSum(arr, n, k, idx + 1, list, res);
    }
}
