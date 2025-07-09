public class LinearSearch {

    public static void main(String[] args) {
        // Goal: Perform linear search on an integer array

        Utilities u = new Utilities(); // Assume this utility handles user input
        int size = 6;
        int[] arr = new int[size];
        int target = 5;

        // Input array from user
        u.inputIntegerArray(size, arr);

        // Flag to track if element is found
        boolean found = false;

        // Linear Search
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("The element " + arr[i] + " is present in the array at index " + i);
                found = true;
                break;  // Stop after first match
            }
        }

        // If element not found
        if (!found) {
            System.out.println( target + " is not found in the array.");
        }
    }
}
