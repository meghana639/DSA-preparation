//leetcode: 387 
// applied coding skills problem
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> other = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(other.containsKey(s.charAt(i))){
                int old_frequency = other.getOrDefault(s.charAt(i),0);
                int new_frequency = old_frequency + 1;
                other.put(s.charAt(i),new_frequency);
            }
            else{
                other.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(other.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
