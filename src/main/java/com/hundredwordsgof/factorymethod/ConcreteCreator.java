package com.hundredwordsgof.factorymethod;

public class ConcreteCreator extends Creator {

  public Product factoryMethod(String type) {

    if (type.equals("A")) {
      return new ConcreteProductA();
    } else if (type.equals("B")) {
      return new ConcreteProductB();
    }

    return null;
  }
}
