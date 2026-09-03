// Print numbers from N to 1 without using loops:
class Solution:
    def printNumbers(self, n):
        if n == 1:
            print(1)
        else:
            print(n)   
            self.printNumbers(n-1) 

