//leetcode: 5
import java.util.Scanner;
class Main{
    public static String longestpalindrome(String s){
        String longest = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(ispalindrome(sub)){
                    if(sub.length() > longest.length()){
                        longest = sub;
                    }
                }
            }
        }
        return longest;

    }
    public static boolean ispalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = longestpalindrome(s);
        System.out.println(longest);
    }
}
