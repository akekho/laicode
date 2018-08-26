//Given two nodes in a binary tree, find their lowest common ancestor 
//(the given two nodes are not guaranteed to be in the binary tree).
//Return null If any of the nodes is not in the tree.

//Assumptions
//There is no parent pointer for the nodes in the binary tree
//The given two nodes are not guaranteed to be in the binary tree

//Examples
//          5
//        /   \
//       9     12
//     /  \      \
//    2    3      14
//
//The lowest common ancestor of 2 and 14 is 5
//The lowest common ancestor of 2 and 9 is 9
//The lowest common ancestor of 2 and 8 is null (8 is not in the tree)




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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        TreeNode result = LCA(root, A, B);
    
        if (result == A) {
            if (LCA(A, B, B) == null) {
                return null;
            }
        }
        if (result == B) {
            if (LCA(B, A, A) == null) {
                return null;
            }
        }       
        return result;
    }
    
    public TreeNode LCA(TreeNode root, TreeNode A, TreeNode B) {
        if (root == null || root == A || root == B) {
            return root;
        }
        
        TreeNode left = LCA(root.left, A, B);
        TreeNode right = LCA(root.right, A, B);
        
        if (left != null && right != null) {
            return root;        
        }
        return left == null ? right : left;         
    }  
}



