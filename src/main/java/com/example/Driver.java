package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Driver {



    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        new Thread(producer).start();
        new Thread(producer).start();


        Consumer consumer = new Consumer(queue);
        new Thread(consumer).start();
    }
}
