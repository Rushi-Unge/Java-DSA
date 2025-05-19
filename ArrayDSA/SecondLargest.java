package ArrayDSA;

class SecondLargest {    

    public static int secondLargest(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest found (all elements may be equal).");
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 10, 0, 1, 80};
        int second = secondLargest(arr);
        System.out.println("Second largest element is " + second);
    }
}






