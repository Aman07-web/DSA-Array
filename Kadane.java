public class Kadane {
    public static void kandnes(int arr[]){
        int ms = arr[0];  
        int cs = arr[0];  

        for(int i = 1; i < arr.length; i++){
            cs = Math.max(arr[i], cs + arr[i]); 
            ms = Math.max(ms, cs);              
        }

        System.out.println("Our max Subarray sum is : " + ms);
    }

    public static void main(String1[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kandnes(arr); 
    }
}
