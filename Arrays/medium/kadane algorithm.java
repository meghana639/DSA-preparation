//leetcode: 53 (Maximum subarray):
class Main {
    public static int findmaxarray(int[] nums){
        int n = nums.length;
        int current_sum = nums[0];
        int max_sum = nums[0];
        for(int i=1;i<n;i++){
            if (current_sum + nums[i] > nums[i]) {
                current_sum += nums[i];
                max_sum = Math.max(current_sum,max_sum);
            }
            else{
                current_sum = nums[i];
                max_sum = Math.max(current_sum,max_sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args){
        int [] nums = {5,4,-1,7,8};
        int ans = findmaxarray(nums);
        System.out.print(ans); 
    }
}

