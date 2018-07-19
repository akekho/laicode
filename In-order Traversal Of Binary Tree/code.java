//Implement an iterative, in-order traversal of a given binary tree, 
//return the list of keys of each node in the tree as it is in-order traversed.

//Examples
//  
//          5
//  
//        /    \
//  
//      3        8
//  
//    /   \        \
//  
//  1      4        11

//In-order traversal is [1, 3, 4, 5, 8, 11]

//Corner Cases
//
//What if the given binary tree is null? Return an empty list in this case.
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
  public List<Integer> inOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inOrderTraversal(root, result);
    return result;
  }  
  
  private void inOrderTraversal(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    
    inOrderTraversal(root.left, result);
    result.add(root.key);
    inOrderTraversal(root.right, result);
  }
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.suuns0qb579w


