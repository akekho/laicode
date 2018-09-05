//Delete the target key K in the given binary search tree if the binary search tree contains K. 
//Return the root of the binary search tree.

//Find your own way to delete the node from the binary search tree, 
//after deletion the binary search tree's property should be maintained.

//Assumptions
//There are no duplicate keys in the binary search tree
//The smallest larger node is first candidate after deletion




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
  public TreeNode delete(TreeNode root, int key) {
    if (root == null) {
      return null;
    }
    
    if (root.key < key) {
      root.right = delete(root.right, key);
    }
    else if (root.key > key) {
      root.left = delete(root.left, key);
    }
    else {
      if (root.left == null && root.right == null) {
        return null;
      }
      else if (root.left == null || root.right == null) {
        return root.left == null ? root.right : root.left;
      }
      else {
        TreeNode smallest = findSmallest(root.right);
        root.key = smallest.key;
        root.right = delete(root.right, smallest.key);
      }
    }
    return root;
  }
  
  private TreeNode findSmallest(TreeNode root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.yzhbu4na97mh



