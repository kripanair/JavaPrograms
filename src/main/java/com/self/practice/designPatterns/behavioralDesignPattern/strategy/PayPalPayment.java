package com.self.practice.designPatterns.behavioralDesignPattern.strategy;

/**
 * Created by krinair on 16/07/18.
 */
public class PayPalPayment implements PaymentStrategy {

	private String emailId;
	private String password;

	public PayPalPayment(String id, String psswrd){
		this.emailId = id;
		this.password = psswrd;
	}
	public void pay(int amount) {
		System.out.println("Paying using PayPal " + amount);
	}
}
