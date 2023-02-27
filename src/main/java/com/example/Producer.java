package com.example;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final Random rand = new Random();

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int i = rand.nextInt(10);
                queue.put(i);
                System.out.println("Produced " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
