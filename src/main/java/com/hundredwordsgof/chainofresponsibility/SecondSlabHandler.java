package com.hundredwordsgof.chainofresponsibility;

public class SecondSlabHandler extends Handler {

	public float handleRequest(Salary salary) {

		// if some condition call handleRequest on successor
		if (salary.getAmount() > 700000) {
			succesor = new ThirdSlabHandler();
			return succesor.handleRequest(salary)+(float) ((700000 - 500000) * 0.1);
		} else {
			return (float) ((salary.getAmount() - 500000) * 0.1);
		}

	}
}