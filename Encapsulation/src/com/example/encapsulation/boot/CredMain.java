package com.example.encapsulation.boot;

import com.example.encapsulation.app.Cred;

public class CredMain {

	public static void main(String[] args) {
		Cred cred=new  Cred();
		
		cred.setHasSecurity(false);
		System.out.println(cred.isHasSecurity());
		
		cred.setOffersCreditCard(true);
		System.out.println(cred.isOffersCreditCard());
		
		cred.setOffersCreditScore(true);
		System.out.println(cred.isOffersCreditScore());
		
		cred.setOffersServices(false);
        System.out.println(cred.isOffersServices());
        
        cred.setProvidesBillReminders(true);
        System.out.println(cred.isProvidesBillReminders());
        
        cred.setProvidesRewards(false);
        System.out.println(cred.isProvidesRewards());
        
        cred.setSupportsMultipleBanks(true);
        System.out.println(cred.isSupportsMultipleBanks());
        
        cred.setSupportsUPIPayments(true);
        System.out.println(cred.isSupportsUPIPayments());
		
		cred.setCompanyName("CRED");
		System.out.println(cred.getCompanyName());
		
		cred.setHeadquarters("Banglore");
		System.out.println(cred.getHeadquarters());
		
		cred.setNumberofCreditCards(9);
		System.out.println(cred.getNumberofCreditCards());
		
		cred.setRegisteredUsers(50);
		System.out.println(cred.getRegisteredUsers());
		
		cred.setSupportedCities(32);
		System.out.println(cred.getSupportedCities());
		
		cred.setHasMobileApp(true);
		System.out.println(cred.isHasMobileApp());
		
		
	}

}
