//Find the number of tree nodes.

//Examples:
//  
//          5
//        /    \
//      3        8
//    /   \        \
//  1      4        11
//
//The number of above binary tree is 6.




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
  public int countNodes(TreeNode root) {
    int[] counter = new int[1];
    inOrder(root, counter);
    return counter[0];
  }
  
  private void inOrder(TreeNode root, int[] counter) {
    if (root == null) {
      return;
    }
    counter[0]++;
    inOrder(root.left, counter);
    inOrder(root.right, counter);
  }
}




