package edu.kis.vh.nursery.collections;

//TODO: Reconsider if file class is needed, and maybe delete it.
public class IntLinkedList implements IntCollection {

	private Node last;

	private int total = 0;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}

}

class Node {

	private final int value;
	private Node prev, next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}



	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
