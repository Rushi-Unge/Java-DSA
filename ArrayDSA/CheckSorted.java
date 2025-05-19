package ArrayDSA;

public class CheckSorted {
     public static boolean isSortedArray(int arr[]){
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
            return isSorted;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3};
        System.out.println(isSortedArray(arr));
    }
}
