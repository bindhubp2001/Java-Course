package com.example.inbuiltclass.boot;

import com.example.inbuiltclass.app.Book;

import com.example.inbuiltclass.app.ThreadClass;

public class ThreadMain extends Thread {
	
	public static void main(String[] args) {
		
		ThreadClass class1=new ThreadClass();
		
		Thread t1 = new Thread(new Book());
		t1.start();
		System.out.println(t1.getName());
		
		
		ThreadClass class2=new ThreadClass("ABC");
		
		
		System.out.println("==================static methods-----------------");
		
		    Thread thread = Thread.currentThread();  
	        thread.setName("My ThreadDumpStack");  
	  
	        
	        thread.setPriority(6);  
	      
	        System.out.println("Current thread: " + thread);  
	      
	        int count = Thread.activeCount();  
	        System.out.println("currently active threads: " + count);  
	  
	       
	        Thread.dumpStack();  
	        
			System.out.println("==================Instance methods-----------------");
			
			

	}

}
