//leetcode: 205 (isomorphic strings):
import java.util.HashMap;
class Main{
    public static boolean isisomorphic(String s, String t){
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch1 = s.charAt(i);
            Character ch2 = t.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1) != ch2){
                    return false;
                }
            }
            else{
                map1.put(ch1,ch2);
            }
            if(map2.containsKey(ch2)){
                if(map2.get(ch2) != ch1){
                    return false;
                }
            }
            else{
                map2.put(ch2,ch1);
            }
        }
        return true;
    }
    public static void main(String[] args){
        String  s = "egg";
        String  t = "acc";
        boolean result = isisomorphic(s, t);
        System.out.println(result);
    }
}
