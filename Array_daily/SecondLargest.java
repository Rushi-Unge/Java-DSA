import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
      
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("Enter the 5 Array Elements : "); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       
        System.out.print("Your Array : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest element is "+secondLargest);
    }
}
