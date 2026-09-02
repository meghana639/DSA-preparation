//Selection sort:
public class sum {
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min_value = i;
            for (int j=i+1;j<n;j++) {
                if(nums[j]<nums[min_value]) {
                    min_value = j;
                }
            }
            int temp = nums[min_value];
            nums[min_value] = nums[i];
            nums[i] = temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
        return nums;
    }
    public static void main(String[]args) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        selectionSort(nums);
    }
}

