package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        System.out.println("Queue Front : " + queue.front.data);
        System.out.println("Queue Rear : " + queue.rear.data);
    }
}
