package com.xworkz.associationmethod.app;
public class Ingredients {
	public String nameOfIngredients;
	public double quantity;
	public double cost;

	public Ingredients(String nameOfIngredients, double quantity, double cost) {
	
		this.nameOfIngredients = nameOfIngredients;
		this.quantity = quantity;
		this.cost = cost;
	}

	public void ingredientsMethod() {
		System.out.println("Name Of Ingredients: " + nameOfIngredients);
		System.out.println("Quantity: " + quantity);
		System.out.println("Cost: " + cost);
	}
}