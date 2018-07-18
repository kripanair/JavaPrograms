package com.self.practice.designPatterns.behavioralDesignPattern.strategy;

/**
 * Created by krinair on 16/07/18.
 */
public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item one = new Item("1",155);
		Item two = new Item("2",255);

		cart.addItem(one);
		cart.addItem(two);

		cart.pay(new CreditCardPayment("Kripa","111","11","1"));
		cart.pay(new PayPalPayment("11","11"));
	}
}
