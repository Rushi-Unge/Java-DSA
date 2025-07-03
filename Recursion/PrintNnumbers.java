package Recursion;

import java.util.Scanner;

public class PrintNnumbers {
    
    static void printDecreasing(int n){
        if(n ==1 ){
            System.out.print(n);  // Base case or Halt case
            return ;
        }
        System.out.print(n + " "); //  self work
        printDecreasing(n-1); // recursive work

    }
    static void printIncreasing(int n){
        
        if(n == 1){
            System.out.print(n + " ");
            return ;
        }    
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        printIncreasing(n);
       System.out.println("");
        printDecreasing(n);
    }
}
