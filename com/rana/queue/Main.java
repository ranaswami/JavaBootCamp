package com.rana.queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        q.dequeue();


    }
}
