public class BinarySearch {
    public static void main(String1[] args) {
        int arr[]={4,6,8,12,14,56};
        int start=0, end=arr.length-1;
        int key=12;
        while(start <= end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element found :"+mid);
            }
            if(arr[mid] < key){
             start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
    
}
