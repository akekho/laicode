//In a binary search tree, find the node containing the largest number smaller than the given target number.
//If there is no such number, return INT_MIN.

//Assumptions:
//The given root is not null.
//There are no duplicate keys in the binary search tree.

//Examples
//  
//      5
//    /    \
//  2      11
//       /    \
//      6     14
//
//largest number smaller than 1 is Integer.MIN_VALUE(Java) or INT_MIN(c++)
//largest number smaller than 10 is 6
//largest number smaller than 6 is 5

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
  public int largestSmaller(TreeNode root, int target) {
    TreeNode curr = root;
    TreeNode solution = new TreeNode(Integer.MIN_VALUE);
    int diff = Integer.MAX_VALUE;
    
    while (curr != null) {
      if (curr.key >= target) {
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
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.noxdr6v10p4c



