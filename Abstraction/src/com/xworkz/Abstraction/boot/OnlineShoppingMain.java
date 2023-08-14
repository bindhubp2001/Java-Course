package com.xworkz.Abstraction.boot;

import com.xworkz.Abstraction.app.Amazon;
import com.xworkz.Abstraction.app.OnlineShopping;

public class OnlineShoppingMain {

	public static void main(String[] args) {
		OnlineShopping onlineShopping = new Amazon();

		onlineShopping.applyPromoCode();
		onlineShopping.checkout();
		onlineShopping.processPayment();
		onlineShopping.sendOrderConfirmation();
		onlineShopping.viewCart();

		System.out.println("----------------------");

		onlineShopping.browseProduct();
		onlineShopping.addToCart();
		onlineShopping.removeFromCart();
		onlineShopping.searchProduct();
		onlineShopping.viewProductDetails();
	}

}
