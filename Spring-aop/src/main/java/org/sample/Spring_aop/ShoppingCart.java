package org.sample.Spring_aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String Status) {
		System.out.println("Checkout Method from ShoppingCart Called");
	}
	
	public String name() {
		return "welcome the program";
	}
}
