public class printArray {
public static void main(String[] args) {
    int [] arr = {10,20,30,40,60};

    display(arr,0);
}

public static void display(int [] arr,int idx){
    if(arr.length==idx){
        return ;
    }

    System.out.println(arr[idx]);
    display(arr, idx+1);
}
}
