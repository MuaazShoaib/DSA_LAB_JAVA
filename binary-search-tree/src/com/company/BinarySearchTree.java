package com.company;

public class BinarySearchTree {
    Node root = null;

    void insert(int data){
        root = insertData(root, data);
    }

    // Insert data in the tree
    Node insertData(Node root, int data){
        // Return a new Node if tree is empty
        if(root == null){
            root = new Node(data);
            return root;
        }

        // Traverse to the right place and insert the node
        if(data < root.data){
            root.left = insertData(root.left, data);
        }
        else if(data > root.data){
            root.right = insertData(root.right, data);
        }
        return root;
    }

    void inOrder_(){
        inOrder(root);
    }

    // Inorder traversal    --> Left, Root, Right
    public void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(" " + root.data + " ");
        inOrder(root.right);
    }

    // Preorder traversal   --> Root, Left, Right
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(" " + root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    // Postorder traversal  --> Left, Right, Right
    public void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data + " ");
    }



}
