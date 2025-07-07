public class CountEvenOdd {
    
    public static void main(String[] args) {
        Utilities u = new Utilities();
        int size = 5;
        int arr[] =new int[size];
        u.inputIntegerArray(size, arr);
        int countEven = 0 , countOdd = 0;

        for (int i = 0; i < size; i++) {
            if(arr[i] %2==0){
                countEven++;
            }else{
                countOdd++;
            }
            
        }
        System.out.println("Count of Even number is "+countEven);
        System.out.println("Count of Odd number is "+countOdd);

    }
}
