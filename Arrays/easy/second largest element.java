//Second largest element:
class arrays {
    public static int secondLargestElement(int[] nums){
        int largest = nums[0];
        int second_largest = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=1;i<n;i++) {
            if(nums[i] > largest){
                second_largest  = largest;
                largest  =nums[i];
            }
            else if(nums[i] < largest && nums[i] > second_largest){
                second_largest = nums[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE) {
            return -1;
        }
        else {
            return second_largest;
        }
    }
    public static void main(String[] args) {
        int [] nums = {10,10,10,10,10};
        int ans = secondLargestElement(nums);
        System.out.print("second largest element is : "+ ans);
    }
}

