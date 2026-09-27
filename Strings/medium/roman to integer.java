//leetcode: 13
import java.util.HashMap;
import java.util.Scanner;
class Main{
    public static int romannumber(String s){
        int ans = 0;
        HashMap<Character,Integer> other = new HashMap<>();
        other.put('I',1);
        other.put('V',5);
        other.put('X',10);
        other.put('L',50);
        other.put('C',100);
        other.put('D',500);
        other.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            int present = other.get(s.charAt(i));
            int next = other.get(s.charAt(i+1));
            if(present < next){
                ans -= present;
            }
            else{
                ans += present;
            }
        }
        ans += other.get(s.charAt(s.length()-1));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = romannumber(s);
        System.out.println(ans);
    }
}
