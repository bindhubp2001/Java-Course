package com.xworkz.supermarket.app.repositoryImpl;

import com.xworkz.supermarket.app.repository.PatientRepository;

public class PatientRepositoryImpl implements PatientRepository {

	private String[] hospitals = new String[10];
	private int pos;

	@Override
	public void store(String hopitalName) {
		if (pos < TOTAL_PATIENTS) {
			this.hospitals[pos] = hopitalName;
			System.out.println("Store hospital Name : " + hopitalName + " at position " + pos);
			pos++;
		} else {
			System.err.println("DS is full Cannot store more");
		}

	}

}
