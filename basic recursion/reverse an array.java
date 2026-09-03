//reverse an array inplace:
class Solution:
    def reverse(self, arr: list, n: int) -> None:
        left = 0
        right = n-1
        while(left < right):
            arr[left],arr[right] = arr[right],arr[left]
            left += 1
            right -= 1

/**/ reverse using another list:
class Solution:
    def reverse(self, arr: list, n: int) -> None:  
        result = []
        for i in range(n-1,-1,-1) :
            result.append(arr[i])
        return result     

