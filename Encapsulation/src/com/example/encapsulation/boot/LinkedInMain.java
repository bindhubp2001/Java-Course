package com.example.encapsulation.boot;

import com.example.encapsulation.app.LinkedIn;

public class LinkedInMain {

	public static void main(String[] args) {
		LinkedIn link = new LinkedIn();
		
		link.setCompanyName("LinkedIn");
		System.out.println(link.getCompanyName());
		
		link.setHeadquarters("California");
		System.out.println(link.getHeadquarters());
		
		link.setLanguagesSupported(10);
		System.out.println(link.getLanguagesSupported());
		
		link.setNumberofIndustries(1003);
		System.out.println(link.getNumberofIndustries());
		
		link.setRegisteredUsers(700000);
		System.out.println(link.getRegisteredUsers());
		
		link.setHasMobileApp(true);
		System.out.println(link.isHasMobileApp());
		
		link.setHasResumeBuilder(true);
		System.out.println(link.isHasResumeBuilder());
		
		link.setJobSearching(false);
		System.out.println(link.isJobSearching());
		
		link.setOffersNetworking(true);
		System.out.println(link.isOffersNetworking());
		
		link.setOffersPremium(false);
		System.out.println(link.isOffersPremium());
		
		link.setProfileCreation(true);
		System.out.println(link.isProfileCreation());
		
		link.setProvidesCompany(true);
		System.out.println(link.isProvidesCompany());
		
		link.setProvidesLearning(true);
		System.out.println(link.isProvidesLearning());
		
		link.setSupportsSharing(true);
		System.out.println(link.isSupportsSharing());

	}

}
