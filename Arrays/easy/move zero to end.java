//leetcode: 283 (move zeroes):
class Main {
    public static void movezeroes(int[] nums){
        int n = nums.length;
        int i = 0;
        for(int j=0;j<n;j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(int j=i;j<n;j++){
            nums[j] = 0;
        }
    }
    public static void main(String[] args){
        int [] nums = {0,1,2,0,4,0,4,};
        movezeroes(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}

