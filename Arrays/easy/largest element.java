//Largest element in the array:
class arrays{
    public static int largestElement(int[] nums){
        int n = nums.length;
        int largest = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[]args){
        int[] nums = {10,2,5,6,7};
        int ans = largestElement(nums);
        System.out.print("the largest is: "+ ans);
    }
}

