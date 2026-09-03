//Longest subarray with sum K:
class Main {
    public static int longestsubarray(int[] nums, int k){
        int n = nums.length;
        int max_length = 0;
        for(int i=0;i<n;i++){
            int current_sum = 0;
            for(int j=i;j<n;j++){
                current_sum += nums[j];
                if(current_sum == k){
                    max_length = Math.max(max_length,j-i+1);
                }
            }
        }
        return max_length;
    }
    public static void main(String[]args){
        int [] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int ans = longestsubarray(nums, k);
        System.out.print(ans);
    }
}




