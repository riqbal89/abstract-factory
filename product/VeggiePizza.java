package com.rifatiqbal.abstract_factory_pattern.product;

import com.rifatiqbal.abstract_factory_pattern.ingredients.factory.PizzaIngredientFactory;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Veggies;

public class VeggiePizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		System.out.println("Tossing dough... " + dough);
		sauce = ingredientFactory.createSauce();
		System.out.println("Adding sauce... " + sauce);
		veggies = ingredientFactory.createVeggies();
		System.out.println("Adding toppings... ");
		for (Veggies topping : veggies) {
			System.out.println(topping + " topping");
		}
		cheese = ingredientFactory.createCheese();
		System.out.println("Adding cheese... " + cheese);
	}
}
