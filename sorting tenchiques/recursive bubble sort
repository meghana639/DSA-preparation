// recursive bubblesort:
class Solution {
    public int[] bubbleSort(int[] nums) {
        bubbleSort(nums,nums.length);
        return nums;
    }
    private void bubbleSort(int[]nums,int n){
        if(n==1){
            return;
        }
        for(int j=0;j<n-1;j++){
            if(nums[j] > nums[j+1]){
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
            }
        }
        bubbleSort(nums,n-1);
    }
}

