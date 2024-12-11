package func.Tree;

public class TreeTraversal {
    // 先序遍历
    public void preorder(TreeNode root) {
        if (root == null) return;
        /**
         * 根
         */
        System.out.print(root.val + " ");
        /**
         * 👈
         */
        preorder(root.left);
        /**
         * 👉
         */
        preorder(root.right);
    }

    // 中序遍历
    public void inorder(TreeNode root) {
        if (root == null) return;
        /**
         * 👈
         */
        inorder(root.left);
        /**
         * 根
         */
        System.out.print(root.val + " ");
        /**
         * 👉
         */
        inorder(root.right);
    }

    // 后序遍历
    public void postorder(TreeNode root) {
        if (root == null) return;
        /**
         * 👈
         */
        postorder(root.left);
        /**
         * 👉
         */
        postorder(root.right);
        /**
         * 根
         */
        System.out.print(root.val + " ");
    }
}
