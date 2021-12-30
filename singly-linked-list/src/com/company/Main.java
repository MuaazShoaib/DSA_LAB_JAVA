package com.company;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Displays the nodes present in the list
        sList.display();
        sList.insert(0, 0);
        sList.display();
        sList.insert(4, 2);
        sList.display();



    }
}
