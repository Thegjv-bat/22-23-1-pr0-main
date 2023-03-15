package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 10;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<>(CAPACITY);
    }


    public void fillStack() {
        int[] primes = {2,3,5,7,11,13,17,19,23,29};
        for (int tenPrimes : primes) {
            stack.push(tenPrimes);
        }
    }

    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
