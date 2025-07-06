
import java.util.Scanner;

public class Utilities {

    public void inputIntegerArray(int size,int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+ size+" array Integer element : ");
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Your Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public void inputCharacterArray(int size,char arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+ size+" array character element : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.next().charAt(0);
        }
        sc.close();
        System.out.print("Your Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
