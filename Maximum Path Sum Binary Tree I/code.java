//Given a binary tree in which each node contains an integer number. 
//Find the maximum possible sum from one leaf node to another leaf node. 
//If there is no such path available, return Integer.MIN_VALUE(Java)/INT_MIN (C++).

//Examples
//
//    -15
//    /    \
//  2      11
//       /    \
//      6     14
//
//The maximum path sum is 6 + 11 + 14 = 31.

//How is the binary tree represented?
//We use the level order traversal sequence with a special symbol "#" denoting the null node.

//For Example:
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
//
//      1
//    /   \
//   2     3
//        /
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
  public int maxPathSum(TreeNode root) {
    int[] max = {Integer.MIN_VALUE};
    helper(root, max);
    return max[0];
  }
  
  private int helper(TreeNode root, int[] max) {
    if (root == null) {
      max[0] = Integer.MIN_VALUE;
      return max[0];
    }    
    if (root.left != null && root.right != null) {
      int left = helper(root.left, max);
      int right = helper(root.right, max);
      max[0] = Math.max(max[0], left + right + root.key);              
      return Math.max(left, right) + root.key;
    }
    else if (root.left != null) {
      int left = helper(root.left, max);
      //max[0] = Math.max(max[0], left + root.key);              
      return left + root.key;      
    }
    else if (root.right != null) {
      int right = helper(root.right, max);
      //max[0] = Math.max(max[0], right + root.key);              
      return right + root.key;      
    }
    else {
      return root.key;
    }
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.lnl6xfrfdrrv



