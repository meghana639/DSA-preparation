//leetcode: 31 (next permutation):
import java.util.Arrays;
class Main {
    public static void nextpermutation(int[] nums){
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int left = i+1;
        int right = n-1;
        while(left < right){
            int another = nums[left];
            nums[left] = nums[right];
            nums[right] = another;
            left ++;
            right --;
        }
    }
    public static void main(String[] args){
        int [] nums = {1,2,3};
        nextpermutation(nums);
        System.out.print(Arrays.toString(nums));
    }
}






