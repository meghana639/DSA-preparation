//leetcode: 75 (sort colors):
//Better solution:
import java.util.Arrays;
class Main {
    public static void sortcolors(int[] nums){
        int n = nums.length;
        int zero = 0;
        int one = 0; // here we did not calculate the two=0 because anyways the last position are filled by two 
                    //so it won't be needed to mention them again
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                zero++;
            }
            else if(nums[i] == 1){
                one++;
            }
        }
        for(int j=0;j<zero;j++){
            nums[j] = 0;
        }
        for(int j=zero;j<zero+one;j++){
            nums[j] = 1;
        }
        for(int j=zero+one;j<n;j++){
            nums[j] = 2;
        }
    }
    public static void main(String[]args){
        int[] nums = {2,0,2,1,1,0};
        sortcolors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

//optimal solution:
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0; //where should 0 go
        int high = n-1;  // where is the element CURRENTLY placed
        int mid = 0;  //where the next 2 should go
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low ++;
                mid ++;
            }
            else if(nums[mid] == 1){
                mid ++;
            }
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high --;
            }
        }
    }
}

