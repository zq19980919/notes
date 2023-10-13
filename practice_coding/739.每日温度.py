#
# @lc app=leetcode.cn id=739 lang=python3
#
# [739] 每日温度
#
from typing import List
# @lc code=start
class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        stack = []
        ans = [0]*n
        for i,tem in enumerate(temperatures):
            while stack and tem>temperatures[stack[-1]]:
                pre_index = stack.pop()
                ans[pre_index] = i - pre_index
            stack.append(i)
        return ans
# @lc code=end

