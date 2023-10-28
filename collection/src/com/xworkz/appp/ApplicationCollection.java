package com.xworkz.appp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.app.dto.ApplicationDTO;

public class ApplicationCollection {

	public static void main(String[] args) {
		
		LocalDate dateInsta=LocalDate.of(2017, 3, 22);
		LocalDate dateFB=LocalDate.of(2008, 2, 1);
		LocalDate dateWhatapp=LocalDate.of(2011, 7, 12);
		LocalDate dateAmazon=LocalDate.of(2012, 10, 7);
		LocalDate dateFlipKart=LocalDate.of(2014, 1, 13);
		
		ApplicationDTO applicationDTO1=new ApplicationDTO("Instagram", "2.o", "Meta", dateInsta, 4.5);
		
		ApplicationDTO applicationDTO2=new ApplicationDTO("FaceBook", "3", "Meta", dateFB, 4.6);
		
		ApplicationDTO applicationDTO3=new ApplicationDTO("WhatsApp", "4", "Meta", dateWhatapp, 4.3);
		
		ApplicationDTO applicationDTO4=new ApplicationDTO("Amazon", "5", "Amazon", dateAmazon, 4.5);
		
		ApplicationDTO applicationDTO5=new ApplicationDTO("Flipkart", "1.8", "Flipkart", dateFlipKart, 3);
		
		Collection<ApplicationDTO> app =new ArrayList<ApplicationDTO>();
	
		app.add(applicationDTO1);
		app.add(applicationDTO2);
		app.add(applicationDTO3);
		app.add(applicationDTO4);
		app.add(applicationDTO5);
		
		Iterator<ApplicationDTO> item1 = app.iterator();
		
		while (item1.hasNext()) {
			
			ApplicationDTO applicationDTO=item1.next();
			System.out.println(applicationDTO.getName());
			
		}
		
		
		
		
		

	}

}
