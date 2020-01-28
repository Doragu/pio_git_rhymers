package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class DefaultCountingOutRhymer {

	protected IntCollection stack;

	public DefaultCountingOutRhymer() {
		stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntCollection stack) {
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
