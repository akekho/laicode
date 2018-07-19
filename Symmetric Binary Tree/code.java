//Check if a given binary tree is symmetric.

//Examples
//
//          5
//
//        /    \
//  
//      3        3
//
//    /   \    /   \
//
//  1      4  4      1
//
//is symmetric.
//
//          5
//  
//        /    \
//
//      3        3
//
//    /   \    /   \
//
//  1      4  1      4
//
//is not symmetric.

//Corner Cases
//
//What if the binary tree is null? Return true in this case.
//How is the binary tree represented?
//
//We use the level order traversal sequence with a special symbol "#" denoting the null node.

//For Example:
//
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
//
//      1
//
//    /   \
//
//   2     3
//
//        /
//
//      4



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
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    
    return symmetric(root.left, root.right);
  }
  
  private boolean symmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    
    if (left == null || right == null) {
      return false;
    }
    
    if (left.key != right.key) {
      return false;
    }    
    
    return symmetric(left.left, right.right) && symmetric(left.right, right.left);    
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.3zu4g3uz1jix



