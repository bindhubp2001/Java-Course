package com.exmaples.casting.util;

import com.exmaples.casting.app3.*;

public class ChocolateUtil {
	public void run(Chocolate chocolate) {

		Chocolate chocolate2 = new Chocolate();
		chocolate2.taste();

		if (chocolate instanceof DarkChocolate) {
			Chocolate dark = new DarkChocolate();
			dark.taste();

			DarkChocolate dark2 = (DarkChocolate) dark;
			dark2.getCost();
		}

		if (chocolate instanceof CaramelChocolate) {
			Chocolate caramel = new CaramelChocolate();
			caramel.taste();

			CaramelChocolate caramel2 = (CaramelChocolate) caramel;
			caramel2.getNoOfPieces();
		}
	}
}
