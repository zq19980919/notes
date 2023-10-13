#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
# 1 解法1 暴力解法
from typing import List
# @lc code=start
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # 哈希表解法
        hashTable = dict()
        for i,num in enumerate(nums):
            if target - num in hashTable:
                return [hashTable[target-num],i]
            hashTable[num] = i
        return []
        