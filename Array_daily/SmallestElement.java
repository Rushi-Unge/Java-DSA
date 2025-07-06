public class SmallestElement {
    
   public static void main(String[] args) {
   
    Utilities u = new Utilities();
    int size = 6;
    int arr[] = new int[size];
    u.inputIntegerArray(size,arr);
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < size; i++) {
        if(arr[i]<smallest){
            smallest=arr[i];
        }
    }
    System.out.println("The Smallest Element is "+smallest);

   }

}
