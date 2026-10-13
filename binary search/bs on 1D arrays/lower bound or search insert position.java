//leetcode: 35
//lower bound = arr[idx] >= n
import java.util.Scanner;
class Main{
    public static  int searchinsert(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] other = new int[n];
        for(int i=0;i<n;i++){
            other[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int something = searchinsert(other,target);
        System.out.print(something);
    }
}
