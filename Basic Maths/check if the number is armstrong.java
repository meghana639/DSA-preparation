//Armstrong number:
class Solution:
    def isArmstrong(self, n):
        if n == 0:
            return True

        original = n
        total = 0
        count = 0

        # Count digits
        while n != 0:
            count += 1
            n //= 10

        # Restore n
        n = original

        # Calculate Armstrong sum
        while n != 0:
            digit = n % 10
            total += digit ** count
            n //= 10

        return total == original         


        






