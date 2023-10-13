#
# @lc app=leetcode.cn id=213 lang=python3
#
# [213] 打家劫舍 II
#

# @lc code=start
from typing import List
class Solution:
    def rob(self, nums: List[int]) -> int:
        def rob1(start:int,end:int):
            first = nums[start]
            second = max(nums[start],nums[start+1])
            for i in range(start+2,end+1):
                first,second = second,max(first+nums[i],second)
            return second
        if not nums:
            return 0
        n = len(nums)
        if n == 1:
            return nums[0]
        elif n == 2:
            return max(nums[0],nums[1])
        return max(rob1(0,n-2),rob1(1,n-1))
# @lc code=end

solution1 = Solution()
print(solution1.rob([2,3,2]))
