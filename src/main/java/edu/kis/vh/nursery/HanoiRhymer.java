package edu.kis.vh.nursery;

/**
 *	Class HanoiRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

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
		if (!callCheck() && (in > peekaboo())) //zle
			totalRejected++;
		else //zle
			super.countIn(in); //zle
	}
}
