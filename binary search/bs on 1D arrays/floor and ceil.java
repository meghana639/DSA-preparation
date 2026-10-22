import java.util.Scanner;
class Main{
    public static int[] getfloorandceil(int[] nums,int x){
        int low = 0;
        int high = nums.length-1;
        int floor = -1;
        int ceil = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == x){
                return new int[]{x,x};
            }
            else if(nums[mid] <= x){
                floor = nums[mid];
                low = mid+1;
            }
            else{
                ceil = nums[mid];
                high = mid-1;
            }
        }
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] result = getfloorandceil(nums, x);
        System.out.print(result[0] + " " + result[1]);
    }
}
