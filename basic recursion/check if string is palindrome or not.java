//leetcode: 125 (Valid Palindrome):
class Solution:
    def isPalindrome(self, s: str) -> bool:
        phrase = ""
        s = s.lower()
        for i in range(len(s)):
            if s[i].isalnum():
                phrase += s[i]      
        if phrase == phrase[::-1]:
            return True
        return False       

