package org.sample.Spring_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	
		ShoppingCart cart = context.getBean(ShoppingCart.class);
		cart.checkout("Cancelled");
		cart.name();
	}

}
