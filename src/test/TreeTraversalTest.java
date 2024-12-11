package test;

import func.Tree.TreeNode;
import func.Tree.TreeTraversal;

public class TreeTraversalTest {
    // 示例运行
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeTraversal traversal = new TreeTraversal();

        System.out.println("Preorder Traversal:");
        traversal.preorder(root);

        System.out.println("\nInorder Traversal:");
        traversal.inorder(root);

        System.out.println("\nPostorder Traversal:");
        traversal.postorder(root);
    }
}
