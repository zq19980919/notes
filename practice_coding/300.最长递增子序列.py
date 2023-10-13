#
# @lc app=leetcode.cn id=300 lang=python3
#
# [300] 最长递增子序列
#

# @lc code=start
from typing import List
class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        # 方法一：动态规划
        # if not nums:
        #     return 0
        # n=len(nums)
        # if n == 1:
        #     return 1
        # dp = [1]*n
        # for i in range(1,n):
        #     for j in range(i):
        #         if nums[i]> nums[j]:
        #             dp[i] = max(dp[i],dp[j]+1)
        # return max(dp)

        # 方法二：贪心加二分
        d = []
        for num in nums:
            if not d or num>d[-1]:
                d.append(num)
            else:
                l,r = 0,len(d) - 1
                loc = r
                while l <= r:
                    mid = (l + r) // 2
                    if d[mid]>=num:
                        loc = mid
                        r = mid - 1
                    else:
                        l = mid + 1
                d[loc] = num
        return len(d)
# @lc code=end

