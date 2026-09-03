//leetcode: 26 (remove duplicates):
class arrays{
    public static int removeduplicates(int[] nums){
        int i = 0;
        int n = nums.length;
        for(int j=1;j<n;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    } 
    public static void main(String[] args){
        int [] nums = {1,2,3,3,4,4,4,5};
        int ans = removeduplicates(nums);
        System.out.println(ans);
        for(int i=0;i<ans;i++){
            System.out.print(" " + nums[i]);
        }
    }
}

