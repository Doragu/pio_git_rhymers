package edu.kis.vh.nursery.collections;

public class IntArrayStack implements IntCollection {

    private static final int IF_EMPTY   = -1;
    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    //TODO: Rename this method, because name doesn't say what method does.
    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1 ;
    }

    //TODO: Rename this method, because name doesn't say what method does.
    public int top() {
        if (isEmpty())
            return EMPTY;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        return numbers[total--];
    }

}
