//leetcode: 7 (Reverse problem):
class Solution:
    def reverse(self, x: int) -> int:
        count = 0
        negative = x<0
        x=abs(x)
        while(x!=0):
            num = x%10
            count = count*10 + num
            x //= 10 
        if negative :
            count = -count
        if count < -2**31 or count > 2**31 - 1:
            return 0
        return count            

