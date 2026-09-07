//leetcode: 1903 (largest odd number):
class Main{
    public static String largestodd(String num){
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i) % 2 != 0){
                String result = num.substring(0,i+1);
                return result;
            }
        }
        return "";
    }
    public static void main(String[] args){
        String num = "545602";
        String result = largestodd(num);
        System.out.println(result);
    }
}
