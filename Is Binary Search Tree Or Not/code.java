//Determine if a given binary tree is binary search tree.

//Assumptions
//
//There should no be duplicate keys in binary search tree.
//You can assume the keys stored in the binary search tree can not be Integer.MIN_VALUE or Integer.MAX_VALUE.

//Corner Cases
//
//What if the binary tree is null? Return true in this case.



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

// Time complexity: O(n) n是number of nodes
// Space complexity: O(height of tree) recursion tree层数为height of tree，每层操作为O(1)
// complete或balanced binary tree时空间复杂度才是O(logn)
// complete属于balanced
// complete：只有最后一层有气泡且气泡在左侧
// balanced：左右子树高度差不超过1
public class Solution {
  public boolean isBST(TreeNode root) {
    return BST_helper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
  }
  
  // max和min是boundary，root的范围是[min, max]，所以最后recusion调用要+1 -1
  private boolean BST_helper(TreeNode root, int max, int min) {
    if (root == null) {
      return true;
    }
    
    if (root.key < min || root.key > max) {
      return false;
    }
        
    return BST_helper(root.left, root.key - 1, min) && BST_helper(root.right, max, root.key + 1);
  }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.u3sjwg77mov4


