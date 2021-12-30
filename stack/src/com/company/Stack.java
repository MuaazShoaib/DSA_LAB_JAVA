package com.company;

public class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data){
        Node temp = new Node(data);
        if(temp == null){
            System.out.println("Stack Overflow");
        }
        temp.next = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        } else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
        } else{
            top = top.next;
        }
    }

    public void display(){
        if(top == null){
            System.out.println("Stack Underflow");
        }
        else{
            Node temp = top;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
