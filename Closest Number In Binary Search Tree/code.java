//In a binary search tree, find the node containing the closest number to the given target number.

//Assumptions:
//The given root is not null.
//There are no duplicate keys in the binary search tree.

//Examples:
//  
//      5
//    /    \
//  2      11
//       /    \
//      6     14
//
//closest number to 4 is 5
//closest number to 10 is 11
//closest number to 6 is 6

//How is the binary tree represented?
//We use the level order traversal sequence with a special symbol "#" denoting the null node.

//For Example:
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
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
  public int closest(TreeNode root, int target) {
    TreeNode curr = root;
    TreeNode solution = curr;
    int diff = Integer.MAX_VALUE;
    
    while (curr != null) {
      if (curr.key == target) {
        return curr.key;
      }
      else if (curr.key > target) {
        if (Math.abs(curr.key - target) < diff) {
          diff = Math.abs(curr.key - target);
          solution = curr;
        }
        curr = curr.left;
      }
      else {
        if (Math.abs(curr.key - target) < diff) {
          diff = Math.abs(curr.key - target);
          solution = curr;
        }
        curr = curr.right;
      }
    }
    return solution.key;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.pp5af8gkp57q



