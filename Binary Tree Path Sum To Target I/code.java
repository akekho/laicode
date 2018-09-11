//Given a binary tree and a target sum, 
//determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given target.

//Example:
//Given the below binary tree and target = 16,
//
//              5
//             / \
//            4   8
//           /   / \
//          1    3  4
//         /  \      \
//        7    2      1
//return true, as there exist a root-to-leaf path 5-8-3 which sum is 16.




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
  public boolean exist(TreeNode root, int target) {  
    return preOrder(root, target, 0);
  }
  
  private boolean preOrder(TreeNode root, int target, int sum) {
    if (root == null) {
      return false;
    }
    
    if (root.left == null && root.right == null) {      
      return sum + root.key == target;
    }
    
    return preOrder(root.left, target, sum + root.key) || preOrder(root.right, target, sum + root.key);
  }
}




