Selection Sort	🔍 Find the smallest and place it correctly.
Bubble Sort	🫧 Compare neighbours; biggest bubbles to the end.
Insertion Sort	🃏 Insert a new card into an already sorted hand.
Merge Sort	✂️ Divide into halves, then merge them back in order.
Quick Sort	📍 Put one pivot in its correct place, then sort the two sides.


//Insertion sort:
class insertionsort {
    public static int[] insertionSort(int[] nums) {
        int n = nums.length; 
        for(int i=1;i<n;i++) {
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
    public static void main(String[]args){
        int[] nums = {13, 46, 24, 52, 20, 9};
        System.out.print("before sorting");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] +" "); 
        }
        System.out.println();
        insertionSort(nums);
        System.out.print("after sorting");
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i] +" ");
        }
    }
}


