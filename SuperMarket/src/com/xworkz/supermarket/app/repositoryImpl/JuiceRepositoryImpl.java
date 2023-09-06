package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.JuiceRepository;

public class JuiceRepositoryImpl implements JuiceRepository {

	private String[] juices = new String[TOTAL];
	private int pos;

	@Override
	public void persirt(String juice) {

		if (pos < TOTAL) {
			this.juices[pos] = juice;
			System.out.println("Store " + juice + " At position " + pos);
			this.pos++;
		} else {
			System.err.println("DS is Full");

		}

	}

	@Override
	public boolean isExist(String juice) {

		for (int i = 0; i <= pos; i++) {
			String temp = juices[i];
			if (temp != null && temp.equals(juice)) {
				System.out.println("Juice already exist");
				return true;
			}

		}

		return false;
	}

}
