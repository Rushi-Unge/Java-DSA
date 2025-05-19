package ArrayDSA;

import java.util.Scanner;

public class LargestElement {


    public static int largestElement(int arr[]){
        int largestNum =arr[0];
        for(int i:arr){
            if(largestNum<i){
                largestNum = i;
            }
           
        }
         return largestNum;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elemnt of the Array.");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();;
        System.out.println("LargestElemnt of the Array is "+ largestElement(arr));
    }
    
}
