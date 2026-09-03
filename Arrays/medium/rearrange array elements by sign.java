//leetcode: 2149 (rearrange array elements by sign):
import java.util.Arrays;
class Main {
    public static int[] rearrangearray(int[] nums){
        int n = nums.length;
        int[] last = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                last[pos] = nums[i];
                pos += 2;
            }
            else{
                last[neg] = nums[i];
                neg += 2;
            }
        }
        return last;
    }
    public static void main(String[]args){
        int [] nums = {3,1,-2,-5,2,-4};
        int [] last = rearrangearray(nums);
        System.out.print(Arrays.toString(last));
    }
}

