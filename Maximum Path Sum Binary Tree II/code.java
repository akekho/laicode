//Given a binary tree in which each node contains an integer number. 
//Find the maximum possible sum from any node to any node (the start node and the end node can be the same). 

//Assumptions
//
//The root of the given binary tree is not null

//Examples
//     -1
//    /    \
//  2      11
//       /    \
//      6    -14
//
//one example of paths could be -14 -> 11 -> -1 -> 2
//another example could be the node 11 itself
//The maximum path sum in the above binary tree is 6 + 11 + (-1) + 2 = 18

//How is the binary tree represented?
//We use the level order traversal sequence with a special symbol "#" denoting the null node.
//For Example:
//The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
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
    public int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        getPath(root, max);
        return max[0];
    }
    
    private int getPath(TreeNode root, int[] max) {            
        if (root == null) {
            return 0;
        }
        // step 1：以当前节点为LCA的左右子树沿着一条path延伸的最大sum 
        // (即每次要么向左要么向右)
        int left = Math.max(getPath(root.left, max), 0);
        int right = Math.max(getPath(root.right, max), 0);
        // step 2：更新max
        max[0] = Math.max(max[0], left + right + root.key);
        // step 3：same as step 1
        return Math.max(left, right) + root.key;
    }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.lnl6xfrfdrrv



