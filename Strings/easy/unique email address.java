//leetcode: 929
//applied coding skills:
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> other = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            StringBuilder process = new StringBuilder();
            boolean domain = false;
            for(int j=0;j<emails[i].length();j++){
                if(emails[i].charAt(j) == '.' && domain == false){
                    continue;
                }
                else if(emails[i].charAt(j) == '+' && domain == false){
                    while(emails[i].charAt(j) != '@'){
                        j++;
                    }
                    domain = true;
                    process.append(emails[i].charAt(j));
                }
                else if(emails[i].charAt(j) == '@'){
                    domain = true;
                    process.append(emails[i].charAt(j));
                }
                else{
                    process.append(emails[i].charAt(j));
                }
            }
            other.add(process.toString());
        }
        return other.size();
    }
}
