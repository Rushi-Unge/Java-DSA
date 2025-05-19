package ArrayDSA;

public class SortArray {

    
    public static int[] bubblesortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums [j+1];
                    nums[j+1] = temp;
                }

            }
            
        }
        return nums;
    }

    
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        
        return nums;
    }


    public static void main(String[] args) {
        int nums[] = {5,6,3,0,1,8,2};
        bubblesortArray(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        sortArray(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    


    
}
