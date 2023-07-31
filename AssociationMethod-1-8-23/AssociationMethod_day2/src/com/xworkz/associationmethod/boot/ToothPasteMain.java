package com.xworkz.associationmethod.boot;

import com.xworkz.associationmethod.app.*;

public class ToothPasteMain {

	public static void main(String[] args) {

		String nameOfPaste = "Sensodyne";
		String brandOfPaste = "Indian Sensodyne";

		Company company = new Company("Sensodyne", "Haleon plc", "India");

		Ingredients ingredientsCalcium = new Ingredients("Calcium", 40, 75);
		Ingredients ingredientsGinger = new Ingredients("Ginger", 30, 55);
		Ingredients ingredientsGarlic = new Ingredients("Garlic", 25, 45);
		Ingredients ingredientsSalt = new Ingredients("Salt", 20, 35);
		Ingredients ingredientsGlysarin = new Ingredients("Glysarin", 35, 65);
		

		Ingredients[] ingredients = { ingredientsSalt, ingredientsGarlic, ingredientsGinger, ingredientsGlysarin,
				ingredientsCalcium };

		ToothPaste paste = new ToothPaste(nameOfPaste, brandOfPaste, company, ingredients);
		paste.toothPasteMethod();
	}

}