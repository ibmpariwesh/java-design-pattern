package com.hundredwordsgof.chainofresponsibility;

import java.time.Month;

public class Salary {
	private float amount;
	private Month month;
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
}
