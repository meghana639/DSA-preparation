//leetcode: 169 (majority element):
//brute force solution:
class Main{
    public static int majorityelement(int[] nums){
        int n = nums.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return nums[0];
    }
    public static void main(String[]args){
        int [] nums = {3,2,3};
        int ans = majorityelement(nums);
        System.out.print(ans);
    }
}

//better solution:
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int old_frequency = map.getOrDefault(nums[i],0);
            int new_frequency = old_frequency + 1;
            map.put(nums[i], new_frequency);
            if(new_frequency > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}

