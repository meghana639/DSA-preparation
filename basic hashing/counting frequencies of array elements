//Counting Frequencies of Array Elements:
class Solution:
    def countFrequencies(self, nums):
        freq = {}
        result = []
        for i in nums:
            if i in freq:
                freq[i] += 1
            else:
                freq[i] = 1
        for key,value in freq.items():
            result.append([key,value])
        return result    

