//leetcode: 1021
class Main{
    public static String removeouterparenthesis(String s){
        int count1 = 0;
        int count2 = 0;
        int start = 0;
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count1 ++;
            }
            else{
                count2 ++;
            }
            if(count1 == count2){
                String part = s.substring(start+1,i);
                ans = ans + part;
                start = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "(()())(())";
        String result = removeouterparenthesis(s);
        System.out.println(result);
    }
}
