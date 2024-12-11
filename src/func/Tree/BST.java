package func.Tree;

public class BST {

    private TreeNode root;

    // 插入节点
    public void insert(int val) {
        root = insertNode(root, val);
    }

    private TreeNode insertNode(TreeNode root, int val) {
        // 每次递归返回的是当前子树的根节点，而初始调用会最终返回整棵树的根节点
        if (root == null) {
            return new TreeNode(val);
        }
        // 插入操作也是递归的，小的话就走左边，调用自己，大的话走右边
        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else if (val > root.val) {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    // 搜索节点
    public boolean search(int val) {
        return searchNode(root, val);
    }

    private boolean searchNode(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        // 三元表达式
        return val < root.val ? searchNode(root.left, val) : searchNode(root.right, val);
    }

    // 中序遍历 (验证排序性)
    public void inorder() {
        inorderTraversal(root);
        System.out.println();
    }

    /**
     * 左根右的顺序，和树的遍历一样
     * @param root
     */
    private void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}
