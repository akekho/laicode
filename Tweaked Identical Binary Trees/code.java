//Determine whether two given binary trees are identical assuming any number of ‘tweak’s are allowed. 
//A tweak is defined as a swap of the children of one node in the tree.

//Examples
//
//          5
//
//        /    \
//
//      3        8
//
//    /   \
//
//  1      4
//
//  and
//
//          5
//
//        /    \
//
//      8        3
//
//             /   \
//
//            1     4
//
//the two binary trees are tweaked identical.

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
  public boolean isTweakedIdentical(TreeNode one, TreeNode two) {
    return symmetric(one, two);
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
    
    return (symmetric(left.left, right.right) && symmetric(left.right, right.left)) ||
           (symmetric(left.left, right.left) && symmetric(left.right, right.right));    
  }  
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.g5po7v4r28um


