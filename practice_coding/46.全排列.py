#
# @lc app=leetcode.cn id=46 lang=python3
#
# [46] 全排列
#

# @lc code=start

from typing import List


class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def dfs(nums,size,path,depth,used,res):
            if depth == size:
                res.append(path[:])
                return
            
            for i in range(size):
                if not used[i]:
                    used[i] = True
                    path.append(nums[i])

                    dfs(nums,size,path,depth+1,used,res)

                    used[i] = False
                    path.pop()
        
        size = len(nums)
        if size == 0:
            return []
        res = []
        used = [False for _ in range(size)]
        dfs(nums,size,[],0,used,res)
        return res
# @lc code=end

