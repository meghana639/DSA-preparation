//leetcode: 219
//applied coding skills problem
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> other = new HashMap<>();
        int diff = 0;
        for(int i=0;i<nums.length;i++){
            if(other.containsKey(nums[i])){
                diff = i - other.get(nums[i]);
                if(diff <= k){
                    return true;
                }
            }
            other.put(nums[i],i);
        } 
        return false;
    }
}
