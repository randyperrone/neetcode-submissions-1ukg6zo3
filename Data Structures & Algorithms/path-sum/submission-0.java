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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();

        queue.add(root);
        sum.add(targetSum - root.val);

        while(!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            Integer currSum = sum.poll();
            
            if (currNode.left == null && currNode.right == null && currSum == 0) {
                return true;
            }

            if (currNode.left != null) {
                queue.add(currNode.left);
                sum.add(currSum - currNode.left.val);
            }
            if (currNode.right != null) {
                queue.add(currNode.right);
                sum.add(currSum - currNode.right.val);
            }
        } 
        return false;
    }
}