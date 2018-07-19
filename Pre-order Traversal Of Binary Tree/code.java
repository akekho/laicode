//Implement an iterative, pre-order traversal of a given binary tree, 
//return the list of keys of each node in the tree as it is pre-order traversed.

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
//
//Pre-order traversal is [5, 3, 1, 4, 8, 11]

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
  public List<Integer> preOrder(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    preOrderTraversal(root, result);
    return result;
  }  
  
  private void preOrderTraversal(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    
    result.add(root.key);    
    preOrderTraversal(root.left, result);
    preOrderTraversal(root.right, result);
  }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.8nycwikvu7v1


