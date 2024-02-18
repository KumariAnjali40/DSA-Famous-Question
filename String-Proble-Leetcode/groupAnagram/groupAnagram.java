// package String-Proble-Leetcode.groupAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public static void main(String[] args) {
        int n=6;

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> ans = anagram(str);
             
          for(List<String> group : ans) {
              
             System.out.println(group.size());
             
            for(String s :group){
                System.out.println(s);
            }
           }


    }

    public static List<List<String>> anagram(String [] strs){
        List<List<String>> res = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char [] ch = str.toCharArray();

            Arrays.sort(ch);

            String sortedChar = String.valueOf(ch);

            if(!map.containsKey(sortedChar)){
                map.put(sortedChar, new ArrayList<String>());
            }

            map.get(sortedChar).add(str);
        }

        for(List<String> list : map.values()){
            res.add(list);
        }

        return res;
    }
}
