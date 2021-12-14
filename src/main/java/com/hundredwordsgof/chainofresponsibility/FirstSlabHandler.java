package com.hundredwordsgof.chainofresponsibility;

/**
 * 
 * ConcreteHandler1 class, handles the request, can access to the next object in
 * a chain and forward the request if necessary.
 * 
 */
public class FirstSlabHandler extends Handler {

	public float handleRequest(Salary salary) {

		// if some condition call handleRequest on successor
		if (salary.getAmount() > 500000) {
			return succesor.handleRequest(salary);
		} else {
			return 0;
		}

	}
}