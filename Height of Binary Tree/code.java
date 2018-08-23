//Find the height of binary tree.

//Examples:
//          5
//        /    \
//      3        8
//    /   \        \
//  1      4        11
//
//The height of above binary tree is 3.



// My solution
//
/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public int getHeight(TreeNode root) {
    return helper(root);
  }
  
  private int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    
    int left = helper(root.left) + 1;
    int right = helper(root.right) + 1;    
    return Math.max(left, right);
  }
}




