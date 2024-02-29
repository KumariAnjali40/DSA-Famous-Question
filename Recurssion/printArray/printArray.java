public class printArray {
public static void main(String[] args) {
    int [] arr = {10,20,30,40,60};

    display(arr,arr.length-1);
}

// public static void display(int [] arr,int idx){
//     if(arr.length==idx){
//         return ;
//     }

//     System.out.println(arr[idx]);
//     display(arr, idx+1);
// }
public static void display(int [] arr, int idx){
    if(idx<0){
        return ;
    }
    display(arr, idx-1);
    System.out.println(arr[idx]);
}
}
