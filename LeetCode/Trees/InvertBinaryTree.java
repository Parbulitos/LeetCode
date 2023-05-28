package LeetCode.Trees;

public class InvertBinaryTree {

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
