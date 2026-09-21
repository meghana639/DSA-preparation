//leetcode: 344
import java.util.Scanner;
class Main{
    public static  void reversestring(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right --;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        reversestring(s);
        System.out.println(s);
    }
}
