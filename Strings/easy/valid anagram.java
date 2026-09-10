//leetcode: 242( valid anagram):
import java.util.HashMap;
class Main{
    public static boolean isanagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                int old_frequency = map1.getOrDefault(s.charAt(i),0);
                int new_frequency = old_frequency + 1;
                map1.put(s.charAt(i),new_frequency);
            }
            else{
                map1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                int old_frequency = map2.getOrDefault(t.charAt(i),0);
                int new_frequency = old_frequency + 1;
                map2.put(t.charAt(i),new_frequency);
            }
            else{
                map2.put(t.charAt(i),1);
            }
        }  
        if(map1.equals(map2)){
            return true;
        }  
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        boolean result = isanagram(s, t);
        System.out.println(result);
    }
}
