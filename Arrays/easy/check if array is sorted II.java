//leetcode:1752 (check if array is sorted and rotated):
class arrays {
    public static boolean check(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        if(nums[n-1] > nums[0]){
            count++;
        }
        if(count <= 1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int [] nums = {3,4,5,1,2};
        boolean ans =  check(nums);
        System.out.print(ans);
    }
}

