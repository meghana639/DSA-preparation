//leetcode: 1 (two sum):
import java.util.*;

class Main {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] ans = twoSum(nums, target);

        System.out.println(Arrays.toString(ans));
    }
}

