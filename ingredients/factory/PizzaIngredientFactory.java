package com.rifatiqbal.abstract_factory_pattern.ingredients.factory;

import java.util.ArrayList;

import com.rifatiqbal.abstract_factory_pattern.ingredients.cheese.Cheese;
import com.rifatiqbal.abstract_factory_pattern.ingredients.clams.Clams;
import com.rifatiqbal.abstract_factory_pattern.ingredients.dough.Dough;
import com.rifatiqbal.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import com.rifatiqbal.abstract_factory_pattern.ingredients.sauce.Sauce;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public ArrayList<Veggies> createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();

}
