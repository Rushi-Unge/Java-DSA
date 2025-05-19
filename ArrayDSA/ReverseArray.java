package ArrayDSA;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int arr[]){
        int n = arr.length;
        
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n - i -1];
            arr[n - i - 1]= temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the value of the array one by one");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array   ");
        for (int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        reverseArray(arr);
        System.out.print("Reversed Array   ");
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}