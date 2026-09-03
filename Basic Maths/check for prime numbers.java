// Prime Numbers:
class Solution:
    def isPrime(self, n):
        result = []
        for i in range(1,n+1):
            if n % i == 0:
                result.append(i)
        if len(result) == 2:
            return True
        return False               

