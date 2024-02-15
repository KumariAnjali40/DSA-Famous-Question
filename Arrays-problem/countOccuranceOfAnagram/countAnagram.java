// package Arrays-problem.countOccuranceOfAnagram;

public class countAnagram {
    public static void main(String[] args) {
        
    
        String txt="forxxorfxdofr";

        String pat= "for";

        int n=txt.length();
        int m=pat.length();

        int [] arr = new int [26];

        for(int i=0;i<m;i++){
            char ch=pat.charAt(i);
            arr[ch-'a']++;
        }

        int i=0;
        int j=0;
        int res=0;

        while(j<n){
            arr[txt.charAt(j)-'a']--;

            if(j-i+1==m){
                if(allZeros(arr)){
                    res++;
                }
                arr[txt.charAt(i)-'a']++;
                i++;
            }
            j++;
        }

        System.out.println(res);
    }

    public static boolean allZeros(int [] arr) {
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }

        return true;
    }
}
