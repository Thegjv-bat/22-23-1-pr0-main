package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        int[] primes = {2,3,5,7,11,13,17,19,23,29};
        for (int tenPrimes : primes) {
            queue.add(tenPrimes);
        }
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
