package LeetCode.Trees;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        if(root.left != null && root.right != null){
            TreeNode copy = root.right;
            root.right = root.left;
            root.left = copy;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }if(root.left == null && root.right == null){
            return root;
        }if(root.left == null && root.right != null){
            root.left = root.right;
            root.right = null;
            invertTree(root.left);
            return root;
        }if(root.left != null && root.right == null){
            root.right = root.left;
            root.left = null;
            invertTree(root.right);
            return root;
        }
        return root;
    }
}
