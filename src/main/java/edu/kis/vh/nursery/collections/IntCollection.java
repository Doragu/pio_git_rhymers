package edu.kis.vh.nursery.collections;

public interface IntCollection {
    //TODO: Make this values protected or private
    int EMPTY  = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int getTotal();

    int pop();
}
