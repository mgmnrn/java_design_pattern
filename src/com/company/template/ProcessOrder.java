package com.company.template;

public abstract class ProcessOrder {
	abstract public void selectProduct();
	abstract public void makePayment();
	abstract public void deliver();
	
	public final void doShopping() {
		selectProduct();
		makePayment();
		deliver();
	}
}
