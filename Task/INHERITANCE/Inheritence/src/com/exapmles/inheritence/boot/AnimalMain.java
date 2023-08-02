package com.exapmles.inheritence.boot;

import com.exapmles.inheritence.app.*;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalMethod();
		System.out.println("--------------------------");
		
		Dog dog=new Dog();
		dog.animalMethod();
		dog.dogMethod();
		
		System.out.println("--------------------------");
		Cat cat = new Cat();
		cat.animalMethod();
		cat.catMethod();
		
		System.out.println("--------------------------");
		Lion lion=new Lion();
		lion.animalMethod();
		lion.lionMethod();
		
		System.out.println("--------------------------");
		Tiger tiger = new Tiger();
		tiger.tigerMethod();
		tiger.animalMethod();
		
		System.out.println("--------------------------");
		Cow cow=new Cow();
		cow.animalMethod();
		cow.cowMethod();
		
		System.out.println("--------------------------");
		Cheetha cheetha=new Cheetha();
		cheetha.animalMethod();
		cheetha.cheethaMethod();
		
		System.out.println("--------------------------");
		Deer deer = new Deer();
		deer.animalMethod();
		deer.deerMethod();
		
		System.out.println("--------------------------");
		Bear bear = new Bear();
		bear.bearMethod();
		bear.animalMethod();
		
	}

}
