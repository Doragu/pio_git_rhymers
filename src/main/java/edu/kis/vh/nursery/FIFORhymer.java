package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntCollection;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntCollection temp = new IntLinkedList();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntCollection stack) {
		super(stack);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		
		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());
		
		return ret;
	}
}

//alt + ← oraz alt + → służą do przęłączania się pomiędzy otwartymi oknami
