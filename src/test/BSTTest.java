package test;

import func.Tree.BST;

public class BSTTest {
    // 示例运行
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println("Inorder Traversal (BST):");
        bst.inorder();

        System.out.println("Search for 4: " + bst.search(4));
        System.out.println("Search for 10: " + bst.search(10));
    }
}
