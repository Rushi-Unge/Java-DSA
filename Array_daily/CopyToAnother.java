public class CopyToAnother {
    
    public static void main(String[] args) {
        Utilities u = new Utilities();
        int size = 5;
        int arr[] = new int[size];
        u.inputIntegerArray(size, arr);
        int copyArr[] = new int[size];
    
        // System.arraycopy(arr, 0, copyArr, 0, size);
        // System.out.println("Copy of array : ");
        // for (int i : copyArr) {
        //     System.out.print(i + " ");
        // }

        // Manual Array copy
        for (int i = 0; i < size; i++) {
            copyArr[i] = arr[i];
        }
            System.out.println("Copy of array : ");
        for (int i : copyArr) {
            System.out.print(i + " ");
        }
    }
}
