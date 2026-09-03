//find the missing number:
class Main{
    public static int missingnumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<=n;i++){
            boolean found = false;
            for(int j=0;j<n;j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[] nums = {0,1,2,4};
        int ans = missingnumber(nums);
        System.out.print(ans);
    }
}

