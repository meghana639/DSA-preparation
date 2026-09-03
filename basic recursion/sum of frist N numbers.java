//Sum of First N Numbers:
class Solution:
    def NnumbersSum(self, N):
        sum = 0
        for i in range(N+1):
            sum += i 
        return sum

