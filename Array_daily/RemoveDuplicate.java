import java.util.HashSet;

public class RemoveDuplicate {
    
    public static void sort(int nums[]){
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums [j+1];
                    nums[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < nums.length-1; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    // Remove duplicates from the sorted array
    public static void main(String[] args) {
        int nums[]= {3,4,2,5,1,5,5,2,2,0,0};
        sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <nums.length-1; i++) {
            set.add(nums[i]);
        }
      System.out.println(set);

    }
}
