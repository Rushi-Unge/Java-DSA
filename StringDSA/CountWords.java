package StringDSA;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence :");
        String str = sc.nextLine();
        int count = 0;

        String arr[] = str.split(" ");
        for(String arr1 : arr) {
            System.out.println(arr1);
            count++;
        }
        System.out.println("Count of words is "+count);
    }
}
