//leetcode: 1838 (Frequency of the most frequent element):
class Solution:
    def maxFrequency(self, nums: List[int], k: int) -> int:
        nums.sort()
        answer = 0
        left = 0
        window_sum = 0
        for right in range(len(nums)):
            window_sum += nums[right]
            target = nums[right] 
            window_size = right - left + 1
            operations = (target * window_size) - window_sum
            while(operations > k):
                window_sum -= nums[left]
                left += 1
                window_size += nums[right]
                operations = right - left + 1
            answer = max(answer,right - left + 1)
        return answer        

