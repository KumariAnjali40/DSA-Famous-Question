class search {
  public static void main(String[] args) {
    int n=5;
    int [] arr ={1,2,3, 5,6};

    int k=4;

    int ans=binarySearch(arr,n,k);
    System.out.println(ans);
}
public static int binarySearch(int []arr,int n,int k){
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==k){
            return mid;
        }else if(arr[mid]<k){
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return -1;
  }
    
}