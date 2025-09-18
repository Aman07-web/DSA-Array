public class MaxofSubArray {
     public static void maxofSubArr(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start=i;
            currSum=0;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max sum : "+maxSum);
    }
    public static void main(String1[] args) {
        int arr[]={2,4,5,6,8};
        maxofSubArr(arr);
    }
}
