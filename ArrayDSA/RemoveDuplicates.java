package ArrayDSA;

import java.util.Scanner;

public class RemoveDuplicates {

    // Manual sort using simple Bubble Sort
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Remove duplicates from sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort the array manually
        sortArray(arr);

        // Step 2: Remove duplicates from sorted array
        int uniqueLength = removeDuplicates(arr);
        sc.close();

        // Step 3: Print unique elements
        System.out.println("Sorted array after removing duplicates:");
        for (int i = 0; i < uniqueLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
