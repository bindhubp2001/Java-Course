package in.examples.overload_override.boot;

import in.examples.overload_override.app.Hotel;
import in.examples.overload_override.app.RecepiesHotel;

public class HotelMain {

	public static void main(String[] args) {
		Hotel hotel=new Hotel();
		
		hotel.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel.roomFacility(true));
		hotel.roomFacility(5000);
		hotel.roomFacility("COLORS");
		hotel.roomFacility(1000,90);
		hotel.roomFacility("SiriMane", 2000, 101);
		
		System.out.println("==============");
		
		Hotel hotel1=new RecepiesHotel();				//override with parent class ref
		
		hotel1.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel1.roomFacility(false));
		hotel1.roomFacility(8000);
		hotel1.roomFacility("OTP");
		hotel1.roomFacility(3000,90);
		hotel1.roomFacility("CFD", 300, 202);
		
		System.out.println("==================");
		
		RecepiesHotel hotel2=new RecepiesHotel();//override with SUb class ref
		
		hotel2.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel2.roomFacility(true));
		hotel2.roomFacility(900);
		hotel2.roomFacility("RAMESHWARA CAFE");
		hotel2.roomFacility(700,90);
		hotel2.roomFacility("District 17", 8000, 303);

	}

}
