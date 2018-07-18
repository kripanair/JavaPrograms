package com.self.practice.designPatterns.behavioralDesignPattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krinair on 16/07/18.
 */
public class ShoppingCart {

	List<Item> listOfItems;

	public ShoppingCart(){
		this.listOfItems = new ArrayList<Item>();
	}

	public void addItem(Item item){
		this.listOfItems.add(item);
	}

	public int calculatePrice(){
		int price = 0;
		for (Item i: listOfItems){
			price = price+i.getItemPrice();
		}
		return price;
	}

	public void pay(PaymentStrategy strategy){
		strategy.pay(calculatePrice());
	}
}
