//Leaders in the Array:
import java.util.*;
class Main {
    public static List<Integer> leaders(int[]nums){
        int n = nums.length;
        int max = nums[n-1];
        List<Integer> last = new ArrayList<>();
        last.add(max);
        for(int i=n-2;i>=0;i--){
            if(nums[i] > max){
                last.add(nums[i]);
                max = nums[i];
            }
        }
        int left = 0;
        int right = last.size()-1;
        while (left < right) {
            int temp = last.get(left);
            last.set(left,last.get(right));
            last.set(right,temp); 
            left ++;
            right --;
        }
        return last; 
    }
    public static void main(String[]args){
        int[] nums = {1, 2, 5, 3, 1, 2};
        List<Integer> result = leaders(nums);
        System.out.println(result);
    }
}

