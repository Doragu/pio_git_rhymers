package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

/**
 *	Class HanoiRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IntCollection stack) {
		super(stack);
	}

	/**
	 *	Amount of rejected numbers
	 */
	private int totalRejected = 0;//zle

	/**
	 *	Returns total amount of rejected items.
	 * @return Amount of rejected numbers.
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 *	Adds a number to a array.
	 * @param in Number to be added.
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && (in > peekaboo()))
			totalRejected++;
		else
			super.countIn(in);
	}
}
