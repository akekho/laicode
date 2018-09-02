//Given two nodes in a binary tree (with parent pointer available), find their lowest common ancestor.

//Assumptions
//
//There is parent pointer for the nodes in the binary tree
//The given two nodes are not guaranteed to be in the binary tree

//Examples
//
//        5
//      /   \
//     9     12
//   /  \      \
//  2    3      14
//
//The lowest common ancestor of 2 and 14 is 5
//The lowest common ancestor of 2 and 9 is 9
//The lowest common ancestor of 2 and 8 is null (8 is not in the tree)




// My solution
//
/**
 * public class TreeNodeP {
 *   public int key;
 *   public TreeNodeP left;
 *   public TreeNodeP right;
 *   public TreeNodeP parent;
 *   public TreeNodeP(int key, TreeNodeP parent) {
 *     this.key = key;
 *     this.parent = parent;
 *   }
 * }
 */
public class Solution {
    public TreeNodeP lowestCommonAncestor(TreeNodeP one, TreeNodeP two) {
        if (one == null || two == null) {
            return null;
        }
        int oneDepth = getDepth(one);
        int twoDepth = getDepth(two);
        
        while (oneDepth > twoDepth) {
            one = one.parent;
            oneDepth--;
        }
        while (oneDepth < twoDepth) {
            two = two.parent;
            twoDepth--;
        }
        
        while (one != two) {
            one = one.parent;
            two = two.parent;
        }
        return one;
    }

    private int getDepth(TreeNodeP node) {
        int height = 0;
        while (node != null) {
            node = node.parent;
            height++;
        }
        return height;
    }
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.n9mfjuh16lm



