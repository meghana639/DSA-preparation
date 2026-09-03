//Longest Consecutive Sequence in an Array:
import java.util.*;
class Main {
    public static int longestconsecutive(int[] nums){
        int n = nums.length;
        int count = 1;
        int largest = 1;
        Arrays.sort(nums);
        if(n == 0){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            else if(nums[i+1] == nums[i]+1){
                count ++;
            }
            else {
                count = 1;
            }
            largest = Math.max(count,largest);
        }
        return largest;
    }
    public static void main(String[]args){
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestconsecutive(nums);
        System.out.print(ans);
    }
}

