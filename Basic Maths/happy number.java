//leetcode: 202
//applied coding skills problem
class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        int sum = 0;
        int digit = 0;
        HashSet<Integer> other = new HashSet<>();
        while(temp != 1 && !other.contains(temp)){
            other.add(temp);
            sum = 0;
            while(temp != 0){
                digit = temp % 10;
                sum += digit * digit;
                temp = temp / 10;
            }
            temp = sum;
        }
        if(temp == 1){
            return true;
        } 
        else{
            return false;
        }
    }
}
