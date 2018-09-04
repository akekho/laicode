//Find the target key K in the given binary search tree, 
//return the node that contains the key if K is found, otherwise return null.

//Assumptions
//There are no duplicate keys in the binary search tree



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
  public TreeNode search(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    if (root.key == key) {
      return root;
    }
    else if (root.key < key) {
      return search(root.right, key);
    }
    else {
      return search(root.left, key);
    }
  }
}



