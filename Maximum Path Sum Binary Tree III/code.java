//Given a binary tree in which each node contains an integer number. 
//Find the maximum possible subpath sum
//(both the starting and ending node of the subpath should be on the same path from root to one of the leaf nodes, 
//and the subpath is allowed to contain only one node).

//Assumptions
//The root of given binary tree is not null

//Examples
//
//     -5
//    /    \
//  2      11
//       /    \
//      6     14
//             /
//          -3
//
//The maximum path sum is 11 + 14 = 25

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
    int[] DP = {Integer.MIN_VALUE};
    getMax(root, DP, 0);
    return DP[0];
  } 
  
  private void getMax(TreeNode root, int[] DP, int sum) {
    if (root == null) {
      return;
    }
        
    sum = Math.max(root.key, root.key + sum);
    DP[0] = Math.max(DP[0], sum);
    getMax(root.left, DP, sum);
    getMax(root.right, DP, sum);    
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.ler0c9aavd85



