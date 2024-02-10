

public class container_with_Most_water {
    public static void main(String[] args) {
        int n=9;
        int [] arr = {1,8,6,2,5,4,8,3,7};

        int i=0;
        int j=n-1;
        int max=0;
        while(i<j){
            if(arr[i]<arr[j]){
                int width=j-i;
                int area=width* arr[i];
                
                max=Math.max(max,area);
                i++;
            }else{
                int width=j-i;
                int area=width*arr[j];
                max=Math.max(max,area);
                j--;
            }
        }
        System.out.println(max);
    }
}
