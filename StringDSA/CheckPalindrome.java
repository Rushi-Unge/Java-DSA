package StringDSA;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse.append(str.charAt(i));
        }
        System.out.print("Reverse String : "+reverse);
        System.out.println("");
        if(str.equals(reverse.toString())){
            System.out.println("The Given String is Palindrome");
        }else{
            System.out.println("The Given String is not Palindrome");
        }
    }
}
