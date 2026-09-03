//union of two sorted arrays:
import java.util.Arrays;
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        List <Integer> other = new ArrayList<>();
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                if(other.size() == 0 || other.get(other.size()-1) != nums1[i]){
                    other.add(nums1[i]);
                }
                i++;
            }
            else{
                if(other.size() == 0 || other.get(other.size()-1) != nums2[j]){
                    other.add(nums2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(other.size() == 0 || other.get(other.size()-1) != nums1[i]){
                other.add(nums1[i]);
            }
            i++;
        }
        while(j < n2){
            if(other.size() == 0 || other.get(other.size()-1) != nums2[j]){
                other.add(nums2[j]);
            }
            j++;
        }
        int[] result = new int[other.size()];
        for(int index=0;index<other.size();index++){
            result[index] = other.get(index);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 4};
        int[] nums2 = {2, 3, 4, 5, 6};
        int[] answer = unionArray(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
}








