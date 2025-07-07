public class SumOfElements {
    
    public static void main(String args[]){
        Utilities u = new Utilities();
        int size = 5;
        int arr[] = new int[size];
        int sum = 0;

        u.inputIntegerArray(size, arr);
        
        for (int i = 0; i < size; i++) {
            sum+=arr[i];
        }
        System.out.println("The Sum of all elements is "+sum);
    }

}
