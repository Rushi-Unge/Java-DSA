public class MergeTwo {
    // merge two array
    public static void main(String[] args) {
        int[] num1 = {2,4,3,5,67,2,3};
        int[] num2 = {3,4,52,32,1};
        // int size = num1.length + num2.length;
        int[] merge = new int[num1.length + num2.length];
        int index = 0;
        for(int i=0;i<num1.length;i++){
            merge[index] = num1[i];
            index++;
        }
        for(int i=0;i<num2.length;i++){
            merge[index] = num2[i];
            index++;
        }
        for (int i : merge) {
            System.out.print(i + " ");
        }
    }
}
