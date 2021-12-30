package com.company;

public class Main {

    public static void main(String[] args) {
	BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.insert(27);
    binarySearchTree.insert(35);
    binarySearchTree.insert(14);

//    binarySearchTree.insert(10);
//    binarySearchTree.insert(19);
//    binarySearchTree.insert(31);
//    binarySearchTree.insert(42);


        System.out.println("Inorder traversal: ");
        binarySearchTree.inOrder_();

    }
}
