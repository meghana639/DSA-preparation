//Bubble sort:
public class bubblesort {
    public static int[] bubblesort(int[] nums){
        int n = nums.length;
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }

            }
        }
        for (int k=0;k<n;k++) {
            System.out.print(nums[k]+" ");
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {13, 46, 24, 52, 20, 9};
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        bubblesort(nums);
    }
}


