package com.company.template;

public class TempaleDesignPattern {

	public static void main(String[] args) {
		ProcessOrder shopVisit =new Shop();
		shopVisit.doShopping();
		ProcessOrder onlineShopping =new Flipkart();
		onlineShopping.doShopping();
		ProcessOrder humanOrder = new HumanOrder();
		humanOrder.doShopping();
	}
}
