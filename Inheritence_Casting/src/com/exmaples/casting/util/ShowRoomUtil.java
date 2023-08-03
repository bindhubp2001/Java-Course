package com.exmaples.casting.util;

import com.exmaples.casting.app1.*;

public class ShowRoomUtil extends ShowRoom{
	
	public void run(ShowRoom room)
	{
		ShowRoom showRoom=new ShowRoom();
		showRoom.printLocation();
		
		if(room instanceof WatchShowRoom)
		{
			ShowRoom watchRoom=new WatchShowRoom();
			watchRoom.printLocation();
			
			WatchShowRoom watchRoom2=(WatchShowRoom)watchRoom;
			watchRoom2.getNameOfShowroom();
			
		}
		
		if(room instanceof MobileShowRoom)
		{
			ShowRoom mobileRoom = new MobileShowRoom();
			mobileRoom.printLocation();
			
			MobileShowRoom mobileRoom2=(MobileShowRoom)mobileRoom;
			mobileRoom2.getGstNo();
		}
	}
}
