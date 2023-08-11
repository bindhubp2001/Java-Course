package com.example.encapsulation.boot;

import com.example.encapsulation.app.Netflix;

public class NetflixMain {

	public static void main(String[] args) {
		Netflix net=new Netflix();
		
		net.setName("Netflix");
		System.out.println(net.getName());
		
		net.setYear(1997);
		System.out.println(net.getYear());
		
		net.setSubscriptionFee(1997);
		System.out.println(net.getSubscriptionFee());
		
	    net.setNoOfSubscribers(400);
	    System.out.println(net.getNoOfSubscribers());
		
	    net.setNoOfOriginal(150);
	    System.out.println(net.getNoOfOriginal());
	    
	    net.setDownloads(true);
	    System.out.println(net.isDownloads());
	    
	    net.setMultipleProfiles(false);
	    System.out.println(net.isMultipleProfiles());
	    
	    net.setHeadQuarter("USA");
	    System.out.println(net.getHeadQuarter());
	    
	    net.setFreeTrial(true);
	    System.out.println(net.isFreeTrial());
		
	    
	    net.setRecommendations(false);
	    System.out.println(net.isRecommendations());
	    
	    net.setNoOfLang(30);
	    System.out.println(net.getNoOfLang());
	    
	    net.setUserReview(false);
	    System.out.println(net.isUserReview());
	    
	    net.setContentQuality("MP4");
	    System.out.println(net.getContentQuality());
		
	    net.setCategory("Comics");
	    System.out.println(net.getCategory());

	}

}
