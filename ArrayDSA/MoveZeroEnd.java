package ArrayDSA;

public class MoveZeroEnd {
    
    public static int[] moveZero(int arr[]) {
        int index = 0; // Position to place the next non-zero element

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 0, 6, 0, 0, 64};
        int array[] = moveZero(arr);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
