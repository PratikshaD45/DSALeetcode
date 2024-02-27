/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     // Height of a tree
        public static int heightOfTree(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            return Math.max(lh, rh) + 1;
        }
    public int diameterOfBinaryTree(TreeNode root) {
        
        
        if (root == null) {
                return 0;
            }
            int ldiam = diameterOfBinaryTree(root.left);
            int rdiam = diameterOfBinaryTree(root.right);
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int selfDiam = lh + rh ;
            return Math.max(selfDiam, Math.max(ldiam, rdiam));
        
    }
}