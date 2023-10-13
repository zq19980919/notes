#
# @lc app=leetcode.cn id=103 lang=python3
#
# [103] 二叉树的锯齿形层序遍历
#

# @lc code=start
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
import collections
from typing import List, Optional


class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        res,deque = [],collections.deque([root])
        while deque:
            tmp = collections.deque()
            for _ in range(len(deque)):
                node = deque.popleft()
                if len(res) % 2 == 0:     # 插入尾部
                    tmp.append(node.val)
                else:
                    tmp.appendleft(node.val)
                if node.left:deque.append(node.left)
                if node.right:deque.append(node.right)
            res.append(list(tmp))
        return res
# @lc code=end

