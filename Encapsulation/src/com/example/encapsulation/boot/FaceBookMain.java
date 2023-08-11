package com.example.encapsulation.boot;

import com.example.encapsulation.app.FaceBook;

public class FaceBookMain {

	public static void main(String[] args) {
		FaceBook user = new FaceBook();

		user.setUsername("kim_lin");
		user.setFullName("kimjohn");
		user.setAge(24);
		user.setGender("Female");
		user.setStatus("Feeling JOYUS!");
		user.setFriendCount(500);
		user.setOnlineStatus(true);
		user.setProfilePictureUrl("https://example.com/kim_lin.jpg");
		user.setCurrentCity("New York");
		user.setHometown("Los Angeles");
		user.setRelationshipStatus("Single");
		user.setPhotosCount(150);
		user.setPostCount(300);
		user.setLikesCount(1200);

		System.out.println("Username: " + user.getUsername());
		System.out.println("Full Name: " + user.getFullName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Gender: " + user.getGender());
		System.out.println("Status: " + user.getStatus());
		System.out.println("Friend Count: " + user.getFriendCount());
		System.out.println("Online Status: " + user.isOnlineStatus());
		System.out.println("Profile Picture URL: " + user.getProfilePictureUrl());
		System.out.println("Current City: " + user.getCurrentCity());
		System.out.println("Hometown: " + user.getHometown());
		System.out.println("Relationship Status: " + user.getRelationshipStatus());
		System.out.println("Photos Count: " + user.getPhotosCount());
		System.out.println("Post Count: " + user.getPostCount());
		System.out.println("Likes Count: " + user.getLikesCount());

	}

}
