package com.rifatiqbal.abstract_factory_pattern.product;

import com.rifatiqbal.abstract_factory_pattern.ingredients.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;	
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		System.out.println("Tossing dough... " + dough);
		sauce = ingredientFactory.createSauce();
		System.out.println("Adding sauce... " + sauce);
		pepperoni = ingredientFactory.createPepperoni();
		System.out.println("Adding pepperoni... " + pepperoni);
		cheese = ingredientFactory.createCheese();
		System.out.println("Adding cheese... " + cheese);
	}
}
