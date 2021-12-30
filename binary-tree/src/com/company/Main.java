// Binary Tree

package com.company;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;

        this.left = null;
        this.right = null;
    }
}

public class Main {

    // Create Tree
    public static Node createTree() {
        Node root = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        int data = scanner.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter for right " + data);
        root.right = createTree();

        return root;
    }

    // Inorder traversal    --> Left, Root, Right
    public static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(" " + root.data + " ");
        inOrder(root.right);
    }

    // Preorder traversal   --> Root, Left, Right
    public static void preOrder(Node root) {
        if (root == null) return;

        System.out.print(" " + root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // Postorder traversal  --> Left, Right, Right
    public static void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data + " ");
    }


    public static void main(String[] args) {

        Node root = createTree();

        System.out.print("Pre order Traversal: ");
        preOrder(root);
        System.out.print("\nIn order Traversal: ");
        inOrder(root);
        System.out.print("\nPost order Traversal: ");
        postOrder(root);

    }

}
