//Examples
//
//          5
//        /    \
//      3        8
//    /   \        \
//   1     4        11
//
//the result is [5, 3, 8, 11, 4, 1]

//Corner Cases
//
//What if the binary tree is null? Return an empty list in this case.

//How is the binary tree represented?
//We use the level order traversal sequence with a special symbol "#" denoting the null node.
//
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
  public List<Integer> zigZag(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    
    Deque<TreeNode> deque = new LinkedList<>();
    deque.offerLast(root);
    int level = 1;
    
    while (!deque.isEmpty()) {
      int size = deque.size();
      level++;
      for (int i = 0; i < size; i++) {
        if (level % 2 != 0) {
          TreeNode node = deque.pollFirst();
          result.add(node.key);
          if (node.left != null) {
            deque.offerLast(node.left);
          }
          if (node.right != null) {
            deque.offerLast(node.right);
          }
        }
        else {
          TreeNode node = deque.pollLast();
          result.add(node.key);          
          if (node.right != null) {
            deque.offerFirst(node.right);
          }
          if (node.left != null) {
            deque.offerFirst(node.left);
          }          
        }
      }
    }
    return result;
  }
}





// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.xw32bmpjgx5q



