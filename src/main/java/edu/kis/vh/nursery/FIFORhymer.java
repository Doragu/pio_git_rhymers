package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntArrayStack stack) {
		super(stack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		
		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}

//alt + ← oraz alt + → służą do przęłączania się pomiędzy otwartymi oknami
