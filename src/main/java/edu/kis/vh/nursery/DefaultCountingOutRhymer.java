package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	private IntLinkedList stack = new IntLinkedList();

	public DefaultCountingOutRhymer() {  }

	public DefaultCountingOutRhymer(IntLinkedList stack) {
		this.stack = stack;
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}
}
