package com.gmail.credentials.boot;


import com.gmail.credentials.app.Store;

public class StoreRunner {
	public static void main(String[] args) {
		System.out.println("------------Printing Emails---------------");
		String[] emails= {"bindhu@gmail.com","sam@gmail.com","Shree@gmail.com","ani@gmail.com","anu@gmail.com"};
		Store email = new Store();
		email.email(emails);
		
		System.out.println("---------Printing Grocery Items----------------");
		String[] groceries = {"Chats","Cake","Meat","Juice","IceCream","Chocolates"};
		Store item = new Store();
		item.groceryItems(groceries);
		
		System.out.println("----------Printing IPLTeamNames----------------");
		String[] teams = {"Chennai Super Kings - CSK","Royal Challengers Bangalore - RCB","Gujarat Titans - GT","Rajasthan Royals - RR","Mumbai Indians - MI","Sunrisers Hyderabad - SRH","Kings XI Punjab - KXIP","Kolkata Knight Riders - KKR","Delhi Capitals - DC","Lucknow SuperGaonts -LSG"};
		Store ipl = new Store();
		ipl.iplTeams(teams);
	}
}
