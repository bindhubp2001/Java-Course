package com.example.encapsulation.boot;

import com.example.encapsulation.app.Irctc;

public class IrctcMain {

	public static void main(String[] args) {
		Irctc irctc=new Irctc();
		
		irctc.setCompanyName("IRCTC");
		System.out.println(irctc.getCompanyName());
		
		irctc.setHeadquartersLocation("Davanagere");
		System.out.println(irctc.getHeadquartersLocation());
		
		irctc.setLanguagesSupported(10);
		System.out.println(irctc.getLanguagesSupported());
		
		irctc.setnumberofTrains(900);
		System.out.println(irctc.getNumberofTrains());
		
		irctc.setRegisteredUsers(7000);
		System.out.println(irctc.getRegisteredUsers());
		
		irctc.setHasMobileApp(true);
		System.out.println(irctc.isHasMobileApp());

		irctc.setCustomerSupport(true);
		System.out.println(irctc.isCustomerSupport());
		
		irctc.setOffersOnlineTicketBooking(false);
		System.out.println(irctc.isOffersOnlineTicketBooking());
		
		irctc.setOffersSpecialDiscounts(false);
		System.out.println(irctc.isOffersSpecialDiscounts());
		
		irctc.setOffersSpecialDiscounts(false);
		System.out.println(irctc.isOffersTourismPackages());
		
		irctc.setPaymentOptions(true);
		System.out.println(irctc.isPaymentOptions());
		
		irctc.setProvidesEcatering(false);
		System.out.println(irctc.isProvidesEcatering());
		
		irctc.setProvidesTravelInsurance(false);
		System.out.println(irctc.isProvidesTravelInsurance());
		
		irctc.setSeatSelection(true);
		System.out.println(irctc.isSeatSelection());
		

	}

}
