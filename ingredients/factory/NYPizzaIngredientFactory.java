package com.rifatiqbal.abstract_factory_pattern.ingredients.factory;

import java.util.ArrayList;

import com.rifatiqbal.abstract_factory_pattern.ingredients.cheese.Cheese;
import com.rifatiqbal.abstract_factory_pattern.ingredients.cheese.ReggianoCheese;
import com.rifatiqbal.abstract_factory_pattern.ingredients.clams.Clams;
import com.rifatiqbal.abstract_factory_pattern.ingredients.clams.FreshClams;
import com.rifatiqbal.abstract_factory_pattern.ingredients.dough.Dough;
import com.rifatiqbal.abstract_factory_pattern.ingredients.dough.ThinCrustPizzaDough;
import com.rifatiqbal.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import com.rifatiqbal.abstract_factory_pattern.ingredients.pepperoni.SlicedPepperoni;
import com.rifatiqbal.abstract_factory_pattern.ingredients.sauce.MarinaraSauce;
import com.rifatiqbal.abstract_factory_pattern.ingredients.sauce.Sauce;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Garlic;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Mushroom;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Onion;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.RedPepper;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThinCrustPizzaDough();
	}
	
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public ArrayList<Veggies> createVeggies() {
		ArrayList<Veggies> veggies = new ArrayList<>();
		veggies.add(new Garlic());
		veggies.add(new Onion());
		veggies.add(new Mushroom());
		veggies.add(new RedPepper());
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClams() {
		return new FreshClams();
	}
}
