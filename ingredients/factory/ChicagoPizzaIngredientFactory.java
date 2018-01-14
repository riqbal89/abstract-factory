package com.rifatiqbal.abstract_factory_pattern.ingredients.factory;

import java.util.ArrayList;

import com.rifatiqbal.abstract_factory_pattern.ingredients.cheese.Cheese;
import com.rifatiqbal.abstract_factory_pattern.ingredients.cheese.MozzarellaCheese;
import com.rifatiqbal.abstract_factory_pattern.ingredients.clams.Clams;
import com.rifatiqbal.abstract_factory_pattern.ingredients.clams.FrozenClams;
import com.rifatiqbal.abstract_factory_pattern.ingredients.dough.Dough;
import com.rifatiqbal.abstract_factory_pattern.ingredients.dough.ThickCrustDough;
import com.rifatiqbal.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import com.rifatiqbal.abstract_factory_pattern.ingredients.pepperoni.SlicedPepperoni;
import com.rifatiqbal.abstract_factory_pattern.ingredients.sauce.PlumTomatoSauce;
import com.rifatiqbal.abstract_factory_pattern.ingredients.sauce.Sauce;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.BlackOlives;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.EggPlant;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Spinach;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	
	public ArrayList<Veggies> createVeggies() {
		ArrayList<Veggies> veggies = new ArrayList<>();
		veggies.add(new EggPlant());
		veggies.add(new BlackOlives());
		veggies.add(new Spinach());
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClams() {
		return new FrozenClams();
	}

}
