package com.xworkz.association.boot;

import com.xworkz.association.app.Laptop;
import com.xworkz.association.app.Trainer;

public class TrainerMain {

	public static void main(String[] args) {
		String trainerName = "Omkar";

		Laptop laptop = new Laptop();

		Trainer trainer = new Trainer(trainerName);
		trainer.setLaptop(laptop);
		trainer.teach();

	}

}
