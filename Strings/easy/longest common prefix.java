//leetcode: 14 (longest common prefix):
class Main{
    public static String longestcommonprefix(String[] s){
        String prefix = s[0];
        for(int i=1;i<s.length;i++){
            while(s[i].startsWith(prefix) == false){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if(prefix.length() == 0){
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String [] s = {"flower","flow","flight"};
        String prefix = longestcommonprefix(s);
        System.out.println(prefix);
    }
}
