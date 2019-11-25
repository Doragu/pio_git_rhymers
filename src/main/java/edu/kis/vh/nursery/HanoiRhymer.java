package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;//zle

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && (in > peekaboo())) //zle
			totalRejected++;
		else //zle
			super.countIn(in); //zle
	}
}
