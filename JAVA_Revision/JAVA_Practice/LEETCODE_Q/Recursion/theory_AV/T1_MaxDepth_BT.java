package LEETCODE_Q.Recursion.theory_AV;
class TreeNode {
      int val;TreeNode left;TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class T1_MaxDepth_BT {
    public static int maxDepth(TreeNode root){
        if (root==null){return 0;}
        int l = maxDepth(root.left);
        int r= maxDepth(root.right);

        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        System.out.println("Finding the max depth of a Binary Tree");

    }
}
