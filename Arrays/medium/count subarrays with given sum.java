//leetcode: 560 (subarray sum equals k):
import java.util.*;
class Main{
    public static int subarraysum(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int current_sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            current_sum += nums[i];
            int required_sum = current_sum - k;
            if(map.containsKey(required_sum)){
                count += map.get(required_sum);
            }

            int old_frequency = map.getOrDefault(current_sum,0);
            int new_frequency = old_frequency + 1;
            map.put(current_sum,new_frequency);
        }
        return count;
    }
    public static void main(String[] args){
        int [] nums = {3,-3,1,1,1};
        int k = 3;
        int ans = subarraysum(nums,k);
        System.out.println(ans);
    }
}


