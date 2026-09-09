//leetcode: 796 (rotate string):
class Main{
    public static boolean rotatestring(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.insert(s.length()-1, ch);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String s = "abcde"; 
        String goal = "cdeab";
        boolean result = rotatestring(s, goal);
        System.out.println(result);
    }
}
