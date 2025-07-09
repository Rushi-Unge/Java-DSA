package StringDSA;

public class RemoveWhitespaces {

    public static void main(String[] args) {

        String str = "  rushi you   are   great   ";

        // 1. Only removes leading and trailing spaces
        System.out.println("Using trim():");
        System.out.println(str.trim()); 
        
        // 2. Remove all whitespaces
        System.out.println("\nRemoving all whitespaces:");
        System.out.println(str.replaceAll("\\s+", ""));  // "rushiyouaregreat"

        // 3. Remove extra spaces between words, keep one space
        System.out.println("\nNormalize spaces between words:");
        System.out.println(str.trim().replaceAll("\\s+", " "));  // "rushi you are great"
    }
}
