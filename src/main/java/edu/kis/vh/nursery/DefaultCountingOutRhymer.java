package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	//TODO: Make this values protected or private
	public static final int EMPTY  = -1;
	public static final int IF_EMPTY   = -1;
	public static final int MAX_SIZE = 12;

	private final int[] numbers = new int[MAX_SIZE];

	public int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int getTotal() {
		return total;
	}

	//TODO: Rename this method, because name doesn't say what method does.
	public boolean callCheck() {
		return total == EMPTY;
	}
		
	public boolean isFull() {
		return total == MAX_SIZE - 1 ;
	}

	//TODO: Rename this method, because name doesn't say what method does.
	protected int peekaboo() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total--];
	}

}
