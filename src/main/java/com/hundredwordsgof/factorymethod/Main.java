package com.hundredwordsgof.factorymethod;

public class Main {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.factoryMethod("C");
		System.out.println(product);
		if(product != null) {
			
		}
	}
}
