package StringDSA;
public class Palindromecheck {

    public static void main(String[] args) {
        String str = "RuR";
        char[] arr = str.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
