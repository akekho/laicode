//Given two keys in a binary search tree, find their lowest common ancestor.

//Assumptions
//There is no parent pointer for the nodes in the binary search tree
//There are no duplicate keys in the binary search tree
//The given two nodes are guaranteed to be in the binary search tree

//Examples
//
//          5
//        /   \
//       2     12
//     /  \      \
//    1    3      14
//
//The lowest common ancestor of 1 and 14 is 5
//The lowest common ancestor of 1 and 3 is 2




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
  public TreeNode lca(TreeNode root, int p, int q) {
    if (root == null) {
      return root;
    }
    
    if (root.key < p && root.key < q) {
      return lca(root.right, p, q);
    }
    else if (root.key > p && root.key > q) {
      return lca(root.left, p, q);
    }
    else {
      return root;
    }
  }
}




