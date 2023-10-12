class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexes = {}
        for i, num in enumerate(nums):
            val = target - num
            if val in indexes:
                return [i, indexes[val]]
            indexes[num] = i
        return None

                
        