// GCD of two numbers:
class Solution:
    def GCD(self, n1, n2):
        gcd = 1
        for i in range(1,min(n1,n2)+1):
            if(n1 % i == 0 and n2 % i == 0):
                gcd = i
        return gcd   

(alternative solution):
class Solution:
    def GCD(self, n1, n2):
        result1 = []
        result2 = []
        for i in range(1,n1+1):
            if n1 % i == 0:
                result1.append(i)
        for j in range(1,n2+1):
            if n2 % i == 0:
                result2.append(j)

        gcd = 1
        for x in result1:
            if x in result2:
                gcd = x
        return gcd        

