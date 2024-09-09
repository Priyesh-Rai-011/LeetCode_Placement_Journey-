package LEETCODE_Q.Recursion.theory_AV;

import javax.management.MBeanAttributeInfo;

class T1_MaxDepth_BT {
    public class TreeNode {
      int val; TreeNode left; TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    class Solution {
        public int maxDepth(TreeNode root) {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Max depth of binary tree : ");
    }
}
