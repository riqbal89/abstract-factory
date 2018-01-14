package com.rifatiqbal.abstract_factory_pattern;

import com.rifatiqbal.abstract_factory_pattern.client.ChicagoPizzaStore;
import com.rifatiqbal.abstract_factory_pattern.client.NYPizzaStore;
import com.rifatiqbal.abstract_factory_pattern.client.PizzaStore;
import com.rifatiqbal.abstract_factory_pattern.product.Pizza;

public class Application {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("veggie");
		System.out.println("1st order is a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("2nd order is a " + pizza.getName() + "\n");
	}

}