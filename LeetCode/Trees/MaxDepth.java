package LeetCode.Trees;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res++;
            return res;
        }
        if (root.left != null && root.right == null) {
            res++;
            return res + maxDepth(root.left);
        }
        if (root.left == null && root.right != null) {
            res++;
            return res + maxDepth(root.right);
        }
        if (root.left != null && root.right != null) {
            res++;
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return res + (leftDepth > rightDepth ? leftDepth : rightDepth);
        }
        return -1;
    }
}