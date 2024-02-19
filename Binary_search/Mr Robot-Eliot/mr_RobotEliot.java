// package Binary_search.Mr Robot-Eliot;

public class mr_RobotEliot {
    public static void main(String[] args) {
        int n=3;
        String s="abcdefghijk";

        eliot(s);
        System.out.println();
    }

    public static void eliot(String s) {
        
        if(s.length()<=2){
            System.out.print(s);
        }else{
            int low=0;
            int high=s.length()-1;
            
            int mid=low+(high-low)/2;
            
            System.out.print(s.charAt(mid));
            eliot(s.substring(0,mid));
            eliot(s.substring(mid+1,s.length()));
        }
    }
}
