//leetcode: 1614
class Main{
    public static int maxdept(String s){
        int max = 0;
        int left = 0;
        int right = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                left ++;
            }
            else if(s.charAt(i) == ')'){
                right ++;
            }
            int result = left - right;
            max = Math.max(result,max);
        }
        return max;
    }
    public static void main(String[] args){
        String s = "()(())((()()))";
        int result = maxdept(s);
        System.out.println(result);
    }
}
