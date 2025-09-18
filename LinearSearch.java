import java.util.Scanner;

public class LinearSearch {
    public static void main(String1[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element u want to search :");
        int search=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.println("Element found :"+i);
            }
        }
    }
}
