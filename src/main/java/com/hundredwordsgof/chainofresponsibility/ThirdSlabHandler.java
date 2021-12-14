package com.hundredwordsgof.chainofresponsibility;

public class ThirdSlabHandler extends Handler {

	public float handleRequest(Salary salary) {

		// if some condition call handleRequest on successor
		if (salary.getAmount() > 1200000 &&succesor != null ) {
			
				return succesor.handleRequest(salary);
		} else {
			return (float) ((salary.getAmount() - 700000) * 0.3);
		}

	}

}
