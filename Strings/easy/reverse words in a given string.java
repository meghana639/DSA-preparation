//leetcode: 151
class Main{
    public static String reversewords(String s){
        int i = s.length()-1;
        String ans = "";
        while(i >= 0){
            // checks and moves if spaces are there
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            // used to check if reaches the start of the string
            if(i < 0){
                break;
            }
            int end = i;
            // used to iterate through the word
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            if(ans.length() > 0){
                ans += " ";
            }
            ans = ans + s.substring(i+1,end+1);
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "the sky is blue";
        String ans = reversewords(s);
        System.out.print(ans);
    }
}
