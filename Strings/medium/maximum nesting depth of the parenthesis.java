//leetcode: 1614
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = maxdept(s);
        System.out.println(result);
    }
}
