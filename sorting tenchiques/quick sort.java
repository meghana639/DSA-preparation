//quick sort:
class quicksort {

    int partition(int[] nums, int low, int high) {

        int i = low - 1;
        int pivot = nums[high];

        for (int j = low; j < high; j++) {

            if (nums[j] < pivot) {

                i++;

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[high];
        nums[high] = nums[i + 1];
        nums[i + 1] = temp;

        return i + 1;
    }

    void quickSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivotIndex = partition(nums, low, high);

        quickSort(nums, low, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, high);
    }

    public static void main(String[] args) {

        quicksort q = new quicksort();

        int[] nums = {13, 46, 24, 52, 20, 9};

        q.quickSort(nums, 0, nums.length - 1);

        System.out.println("Sorted Array:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
