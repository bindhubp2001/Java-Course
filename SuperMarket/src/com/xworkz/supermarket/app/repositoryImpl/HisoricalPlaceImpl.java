package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.HistoricalPlace;

public class HisoricalPlaceImpl implements HistoricalPlace {

	private String[] place = new String[10];
	int pos;

	@Override
	public void save(String place) {

		if (pos < ToTAL_PLACES) {
			this.place[pos] = place;
			System.out.println("Store place " + place + " in position " + pos);
			pos++;
		} else {
			System.err.println("DS is Full Cannot Store more..");
		}

	}

}
