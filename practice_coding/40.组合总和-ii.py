#
# @lc app=leetcode.cn id=40 lang=python3
#
# [40] 组合总和 II
#

# @lc code=start
from typing import List


class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        def dfs(begin:int,size,target,used,path,res):
            if target < 0:
                return
            if target == 0:
                res.append(path[:])
            
            for i in range(begin,size):
                if not used[i]:
                    if i > 0 and candidates[i] == candidates[i-1] and not used[i-1]:
                        continue
                    used[i] = True
                    path.append(candidates[i])
                    target -= candidates[i]
                    dfs(i+1,size,target,used,path,res)
                    target += candidates[i]
                    used[i] = False
                    path.pop()
        
        size = len(candidates)
        res = []
        if size == 0:
            return []
        candidates.sort()
        used = [False for _ in range(size)]
        dfs(0,size,target,used,[],res)
        return res
# @lc code=end

