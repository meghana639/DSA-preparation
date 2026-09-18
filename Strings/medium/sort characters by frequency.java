//leetcode: 451 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main{
    public static String frequencysort(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int old_frequency = map.getOrDefault(s.charAt(i),0);
                int new_frequency = old_frequency + 1;
                map.put(s.charAt(i), new_frequency);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            char ch = entry.getKey();
            int frequency = entry.getValue();
            for(int i=0;i<frequency;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s = "tree";
        String ans = frequencysort(s);
        System.out.println(ans);
    }
}
