//single number:
class Main {
    public static int singlenumber(int[] nums){
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int []nums = {2,2,1};
        int sol = singlenumber(nums);
        System.out.print(sol);
    }
}

