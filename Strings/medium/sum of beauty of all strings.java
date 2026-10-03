//leetcode: 1781
import java.util.Scanner;
class Main{
    public static int beautysum(String s){
        int total = 0;
        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j) - 'a']++;
                int beauty = max(freq) - min(freq);
                total += beauty;
            }
        }
        return total;
    }
    public static int max(int[] freq){
        int max = 0;
        for(int i=0;i<26;i++){
            max = Math.max(max,freq[i]);
        }
        return max;
    }
    public static int min(int[] freq){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i] != 0){
                min = Math.min(min,freq[i]);
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int total = beautysum(s);
        System.out.println(total);
    }
}
