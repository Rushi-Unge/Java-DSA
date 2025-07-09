package StringDSA;

import java.util.Objects;

public class CompareStrings {

    public static void main(String[] args) {
        // Creating two string literals
        String s1 = "Rushikesh";
        String s2 = "Rushikesh";

        // String created using 'new' keyword (stored in different memory location)
        String s3 = new String("Rushikesh");

        System.out.println("Comparing String s1 and s2:");

        // Using '==' operator
        // This checks whether both s1 and s2 refer to the same object in memory (reference comparison)
        if (s1 == s2) {
            System.out.println("✅ s1 and s2 are equal using == (reference comparison)");
        } else {
            System.out.println("❌ s1 and s2 are NOT equal using == (reference comparison)");
        }

        // Using equals() method
        // This checks the content of the strings (value comparison)
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal using equals() (value comparison)");
        } else {
            System.out.println("s1 and s2 are NOT equal using equals()");
        }

        System.out.println("\nComparing String s1 and s3:");

        // Using '==' operator: s3 is created with new, so it's a different reference
        if (s1 == s3) {
            System.out.println("s1 and s3 are equal using == (reference comparison)");
        } else {
            System.out.println("s1 and s3 are NOT equal using == (reference comparison)");
        }

        // Using equals(): compares values correctly
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 are equal using equals() (value comparison)");
        } else {
            System.out.println("s1 and s3 are NOT equal using equals()");
        }

        // Using compareTo() method
        // This returns 0 if strings are equal, a positive or negative number based on lexicographical comparison
        if (s1.compareTo(s2) == 0) {
            System.out.println("s1 and s2 are equal using compareTo()");
        } else {
            System.out.println("s1 and s2 are NOT equal using compareTo()");
        }

        // Using Objects.equals() - handles null values safely
        if (Objects.equals(s1, s2)) {
            System.out.println("s1 and s2 are equal using Objects.equals()");
        } else {
            System.out.println("s1 and s2 are NOT equal using Objects.equals()");
        }
    }
}
