//leetcode : 9 (Palindrome Number):
class Solution:
    def isPalindrome(self, x: int) -> bool:
        count = 0
        original = x
        if x < 0:
            return False
        while(x>0):
            num = x % 10
            count = count * 10 + num
            x //= 10
        if count == original:
            return True  
        return False        

