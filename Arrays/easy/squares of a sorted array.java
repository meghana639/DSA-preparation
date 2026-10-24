//leetcode: 977
//applied coding skills problem:
//o(nlogn) solution:

class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}

// optimal solution [o(n)]:
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;
        while(left <= right){
            int left_square = nums[left] * nums[left];
            int right_square = nums[right] * nums[right];
            if(left_square > right_square){
                result[index] = left_square;
                left ++;
            }
            else{
                result[index] = right_square;
                right --;
            }
            index --;
        }
        return result;
    }
}
