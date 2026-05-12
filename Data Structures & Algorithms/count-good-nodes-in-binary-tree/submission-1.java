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
    
    public int getGoodNode(TreeNode root, int max){
        if(root == null) return 0;

        int res = 0;
        if(root.val >= max) res = 1;
        
        res += getGoodNode(root.left, Math.max(max, root.val));
        res += getGoodNode(root.right, Math.max(max, root.val));

        return res;
    }

    public int goodNodes(TreeNode root) {
        return getGoodNode(root, root.val);
    }
}
