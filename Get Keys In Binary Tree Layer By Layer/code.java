//Get the list of list of keys in a given binary tree layer by layer. 
//Each layer is represented by a list of keys and the keys are traversed from left to right.

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
//   1     4        11
//
//  the result is [ [5], [3, 8], [1, 4, 11] ]

//Corner Cases
//
//What if the binary tree is null? Return an empty list of list in this case.
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
  public List<List<Integer>> layerByLayer(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    
    if (root == null) {
      return result;
    }
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> child = new ArrayList<>();
      
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        child.add(node.key);
        
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }        
      }    
      
      result.add(child);
    }
    
    return result;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.q4cemnltznq4


