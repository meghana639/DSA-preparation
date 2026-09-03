//leetcode: 509 (Fibonacci number):
class Solution:
    def fib(self, n: int) -> int:
        first = 0
        second = 1
        if n == 0:
            return 0
        if n == 1:
            return 1
        while(n > 1):
            third = first + second
            first = second
            second = third
            n -= 1
        return third 
//alternate:
class Solution:
    def fib(self, n: int) -> int:
        if n == 0:
            return 0
        elif n == 1:
            return 1
        else:
            return self.fib(n-1) + self.fib(n-2)                                           






