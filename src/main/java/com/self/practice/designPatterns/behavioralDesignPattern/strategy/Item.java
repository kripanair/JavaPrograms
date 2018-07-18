package com.self.practice.designPatterns.behavioralDesignPattern.strategy;

/**
 * Created by krinair on 16/07/18.
 */
public class Item {
	private String itemCode;
	private int itemPrice;

	public Item(String code, int price){
		this.itemCode = code;
		this.itemPrice = price;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public String getItemCode() {
		return itemCode;
	}
}
