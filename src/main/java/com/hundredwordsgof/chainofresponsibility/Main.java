package com.hundredwordsgof.chainofresponsibility;

import java.time.Month;

public class Main {
	public static void main(String[] args) {
		Salary salary = new Salary();
		salary.setAmount(800000);
		salary.setMonth(Month.APRIL);
		Handler calculator = new FirstSlabHandler();
		
		float finalTaxAmount = calculator.handleRequest(salary);
		System.out.println(finalTaxAmount);
	}
}
