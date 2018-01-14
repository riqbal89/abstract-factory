package com.rifatiqbal.abstract_factory_pattern.client;

import com.rifatiqbal.abstract_factory_pattern.ingredients.factory.ChicagoPizzaIngredientFactory;
import com.rifatiqbal.abstract_factory_pattern.ingredients.factory.PizzaIngredientFactory;
import com.rifatiqbal.abstract_factory_pattern.product.CheesePizza;
import com.rifatiqbal.abstract_factory_pattern.product.ClamPizza;
import com.rifatiqbal.abstract_factory_pattern.product.PepperoniPizza;
import com.rifatiqbal.abstract_factory_pattern.product.Pizza;
import com.rifatiqbal.abstract_factory_pattern.product.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		switch (type.toLowerCase()) {
		case "cheese":
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Cheese Pizza");
			return pizza;
		case "veggie":
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Veggie Pizza");
			return pizza;
		case "clam":
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Clam Pizza");
			return pizza;
		case "pepperoni":
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Pepperoni Pizza");
			return pizza;
		}
		return pizza;
	}

}
