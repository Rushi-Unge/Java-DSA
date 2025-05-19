package ArrayDSA;

class ArrayExample {
    public static void main(String args[]) {

        // Declare and initialize an Array
        int marks[] = {20, 67, 84, 56};

        // Correct way to print array using for-each loop
        for (int i =0; i<marks.length;i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // Declare and initialize another array
        int count[] = new int[5];
        count[0] =67;
        count[2]=24;
        count[4]=100;

        // Optional: print the count array [array traversal]
        for (int i : count) {
            System.out.print(i + " ");  // all will be 0 by default
        }
    }
}
