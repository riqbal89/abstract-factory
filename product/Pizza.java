package com.rifatiqbal.abstract_factory_pattern.product;

import java.util.ArrayList;

import com.rifatiqbal.abstract_factory_pattern.ingredients.cheese.Cheese;
import com.rifatiqbal.abstract_factory_pattern.ingredients.clams.Clams;
import com.rifatiqbal.abstract_factory_pattern.ingredients.dough.Dough;
import com.rifatiqbal.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import com.rifatiqbal.abstract_factory_pattern.ingredients.sauce.Sauce;
import com.rifatiqbal.abstract_factory_pattern.ingredients.veggies.Veggies;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	ArrayList<Veggies> veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slice");
	}
	
	public void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		// toString method
		return "";
	}

}
