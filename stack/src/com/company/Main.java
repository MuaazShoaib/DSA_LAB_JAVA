package com.company;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();

        System.out.println();
        stack.pop();
        stack.pop();

        stack.display();

        System.out.println();

        System.out.println("Top element is : " + stack.peek());

    }
}
