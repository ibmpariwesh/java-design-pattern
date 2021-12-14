package com.hundredwordsgof.chainofresponsibility;

/**
 * 
 * Handler interface, declares an interface for request handling
 *
 */
public abstract class Handler {

  protected Handler succesor;

  abstract float handleRequest(Salary salary);

  public void setSuccesor(Handler succesor) {
    this.succesor = succesor;
  }
}
