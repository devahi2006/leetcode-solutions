//hard
//prbl.no:114
class Solution {

    private TreeNode flattenTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode leftTail = flattenTree(root.left);
        TreeNode rightTail = flattenTree(root.right);

        if (leftTail != null) {
            leftTail.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return (rightTail == null) ? leftTail : rightTail;
    }

    public void flatten(TreeNode root) {
        flattenTree(root);
    }
}
