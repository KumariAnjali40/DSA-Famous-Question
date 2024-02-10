
import java.util.HashMap;

public class kUniqueChar {
    public static void main(String [] args){
        
        String s="aabacbebebe";
        int k=3;
        
        int ans=longestUniqueSizeK(s,k);
        System.out.println(ans);

    }

    public static int longestUniqueSizeK(String s, int k){
        HashMap<Character,Integer>map= new HashMap<>();
        int i=0;
        int j=0;
        int max=-1;
        
        while(j<s.length()){
            
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
            }else{
                map.put(s.charAt(j),1);
            }
            
            if(map.size()<k){
                j++;
            }
            
            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else{
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
