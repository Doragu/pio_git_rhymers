package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack stack = new IntArrayStack();

	public DefaultCountingOutRhymer() {  }

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}
}
