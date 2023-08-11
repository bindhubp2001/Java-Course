package com.example.encapsulation.boot;

import com.example.encapsulation.app.YouTube;

public class YouTubeMain {

	public static void main(String[] args) {
		YouTube you = new YouTube();
		
		you.setSubscriber(9765443);
		you.setIsSubscription(true);
		you.setViews(1554546);
		you.setLikes(45454);
		you.setDislike(12345678);
		you.setChannelName("Smart Snippets");
		you.setOwner("dfgh dfgh");
		you.setGood(false);
		you.setAppSize(455);
		you.setName("sdfghjkl");
		you.setApiKey(5454464644.04f);
		
		System.out.println(you.getSubscriber());
		System.out.println(you.isSubscription());
		System.out.println(you.getViews());
		System.out.println(you.getLikes());
		System.out.println(you.getDislike());
		System.out.println(you.getChannelName());
		System.out.println(you.getOwner());
		System.out.println(you.getGood());
		System.out.println(you.getAppSize());
		System.out.println(you.getName());
		System.out.println(you.getApiKey());
		System.out.println(you.getWatchHour());
		System.out.println(you.getDownloads());
		System.out.println(you.getComments());

	}

}
