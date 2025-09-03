public class Reverse {
    public static void main(String[] args) {
        int arr[]={3,45,667,21,4};
        int first=0;
        int last=arr.length-1;
        while(first < last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        System.out.print("Reverse array : ");
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
