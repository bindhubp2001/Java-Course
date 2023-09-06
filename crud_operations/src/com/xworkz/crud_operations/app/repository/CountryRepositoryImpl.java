package com.xworkz.crud_operations.app.repository;

public class CountryRepositoryImpl implements CountryRepository {
	
	private String[] names=new String[TOTAL];
	
	private int index;

	@Override
	public void save(String countryName) {
		
		if(index<TOTAL) {
			this.names[index]=countryName;
			System.out.println("Store "+countryName +" At position "+index);
			this.index++;
		}
		else {
			System.err.println("DS IDS FULL");
		}

	}
	
	@Override
	public boolean isExsit(String countryName) {
		
		for(int i=0;i<index;i++) {
			String temp=names[i];
			
			if(temp!=null && temp.equals(countryName))
			{
				System.out.println("Country Name Already exist");
				return true;
			}
		}
		
		return CountryRepository.super.isExsit(countryName);
	}
}


