// we want in minimum push we can write a char.
//so that's why first time we will push each char to empty number key.
//we are checking for each key there is how many character is present so we need a map for that
//we will start assigning form 2 , and whenever our key >10 we will change our assign key to 2 .


/**  example:-
 *   according to question each character is unique
 *    suppost we have a String ,
 *   
 *   Word="xyzabcdef"  output=10; for x=1 push for y=1,z=1,a=1,b=1,c=1,d=1,e=1
 *                                f=2; total=10

          2    3 
          (x)  (y)
          (f)

      4    5    6
     (z)  (a)  (b)


     7    8     9
     (c)  (d)  (e)
**/








import java.util.*;

public class minimumPushes{
   
    public static void main(String [] args){
        
        String word="xyzabcdef";
    
       int ans= minimumPush(word);
       System.out.println("Minimum pushes: " + ans);
    }

    public static int minimumPush(String word){
        int ans=0;

        //2 3 4 5 6 7 8 9 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= 9; i++) {
            map.put(i, 0);
        }

        int key = 2;  // our starting key is 2.

        for (char ch : word.toCharArray()) {
            if (key > 9) {
                key = 2;
            }
            
            // Update the map with the current key
            map.put(key, map.get(key) + 1);
            ans += map.get(key);

            key++;
        }

        return ans;
    }

}