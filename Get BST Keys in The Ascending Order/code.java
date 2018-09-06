//print a ascending order for keys of Binary search tree.

//Examples
//   
//          5
//        /    \
//      3        8
//    /   \
//  1      4
//  return [1 3 4 8 5]




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
  public List<Integer> getKeys(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inOrder(root, result);
    return result;
  }
  
  private void inOrder(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    inOrder(root.left, result);
    result.add(root.key);
    inOrder(root.right, result);
  }
}




