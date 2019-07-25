class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        index = 0
        length = len(nums)
        while index < length:
            if index+1 == length:
                return nums[length-1]
            if nums[index] != nums[index+1]:
                return nums[index]
            else:
                index+=2