//Given two nodes in a binary tree, find their lowest common ancestor.

//Assumptions
//
//There is no parent pointer for the nodes in the binary tree
//The given two nodes are guaranteed to be in the binary tree

//Examples
//  
//          5
//        /   \
//       9     12
//     /  \      \
//    2    3      14
//
//The lowest common ancestor of 2 and 14 is 5
//The lowest common ancestor of 2 and 9 is 9




// My solution
//
public class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode one, TreeNode two) {
    if (root == null || root == one || root == two) {
      return root;
    }
    
    TreeNode left = lowestCommonAncestor(root.left, one, two);
    TreeNode right = lowestCommonAncestor(root.right, one, two);    
    
    if (left != null && right != null) {
      return root;
    }    
    return left == null ? right : left;
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.yx1vgbbnultk



