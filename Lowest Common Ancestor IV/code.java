//Given K nodes in a binary tree, find their lowest common ancestor.

//Assumptions
//K >= 2
//There is no parent pointer for the nodes in the binary tree
//The given K nodes are guaranteed to be in the binary tree

//Examples
//          5
//        /   \
//       9     12
//     /  \      \
//    2    3      14
//
//The lowest common ancestor of 2, 3, 14 is 5
//The lowest common ancestor of 2, 3, 9 is 9



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
  public TreeNode lowestCommonAncestor(TreeNode root, List<TreeNode> nodes) {
    if (root == null || nodes.contains(root)) {
      return root;
    }
    
    TreeNode left = lowestCommonAncestor(root.left, nodes);
    TreeNode right = lowestCommonAncestor(root.right, nodes);    
    
    if (left != null && right != null) {
      return root;
    }
    return left == null ? right : left;
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.ryi4wj4cgxr3



