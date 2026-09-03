// Print numbers from 1 to N without using loops:
class Solution:
    def printNumbers(self, n):
        if n == 1:
            print(1)
        else:
            self.printNumbers(n-1)
            print(n)   

