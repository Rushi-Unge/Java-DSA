package Array_daily;
import java.util.Scanner;

public class LargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Array Element :");
        int arr[] = new int[5];
        int max = Integer.MIN_VALUE; 

        // input array 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Thr Given Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("The Largest Element from the Array is " + max );
    
    }
}