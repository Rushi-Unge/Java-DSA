public class ReverseArray {
 
    public static void main(String[] args) {
        Utilities u  = new Utilities();
        int size = 5;
        int arr[] = new int[size];
        u.inputIntegerArray(size, arr);
        int left =  0;
        int right = arr.length-1;

        System.out.println("Reverse the Array Using Two Pointer Approach ");
       while(left<right){
        int temp = arr[left];
        arr[left] =arr[right];
        arr[right] =temp;
        left++;
        right--;
       }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
