package com.self.practice.designPatterns.behavioralDesignPattern.strategy;

/**
 * Created by krinair on 16/07/18.
 */
public class CreditCardPayment implements PaymentStrategy{

	private String customerName;
	private String cardNumber;
	private String expiryDate;
	private String cvv;

	public CreditCardPayment(String name, String cNum, String exp, String cvv){

		this.customerName = name;
		this.cardNumber = cNum;
		this.expiryDate = exp;
		this.cvv = cvv;
	}

	public void pay(int amount) {
		System.out.println("Paying by Credit Card " + amount);
	}
}
