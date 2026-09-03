//linear search:
class Main {
    public static int linearsearch(int[] nums,int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] nums = {2,3,4,5,6,7};
        int target = 3;
        int ans = linearsearch(nums, target);
        System.out.print(" "+ans);
    }
}

