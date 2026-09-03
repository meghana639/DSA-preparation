//Count all Digits of a Number:
class Solution:
    def countDigit(self, n):
        if n == 0:
            return 1
        count = 0
        while(n != 0):
            n = n // 10
            count += 1
        return count
              
