package ArrayDSA;
class SumofElement {
    public static int sumofElement(int arr[]){
        int count = 0;
        for(int i:arr){
            count+=i;
        }
        return count;
    }
    
    public static void main(String[] args) {
    int arr[] ={1,2,3,5};

    System.out.println(sumofElement(arr));
    
    }
}
