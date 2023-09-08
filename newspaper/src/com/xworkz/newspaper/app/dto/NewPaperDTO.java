package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewPaperDTO implements Serializable{

	private String name;
	private String publisher;
	private int pages;
	
	public NewPaperDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public NewPaperDTO(String name, String publisher, int pages) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.pages = pages;
	}



	@Override
	public String toString() {
		return "NewPaperDTO [name=" + name + ", publisher=" + publisher + ", pages=" + pages + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
