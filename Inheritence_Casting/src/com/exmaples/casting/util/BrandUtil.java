package com.exmaples.casting.util;

import com.exmaples.casting.app5.*;

public class BrandUtil {
	public void run(Brand brand) {
		
		Brand brand2 = new Brand();
		brand2.getBrandName();
		
		if(brand instanceof LocalBrand)
		{
			Brand local=new LocalBrand();
			local.getBrandName();//Brand
			
			LocalBrand local1=(LocalBrand)local;
			local1.getLocalBrand();;//Local Brand
		
		}
		if(brand instanceof NationalBrand)
		{
			Brand national=new NationalBrand();
			national.getBrandName();//Brand
			
			NationalBrand national2=(NationalBrand)national;
			national2.getNationalBrandName();
		}
		
		if(brand instanceof InternationalBrand)
		{
			Brand inter=new InternationalBrand();
			inter.getBrandName();//Brand
			
			InternationalBrand inter2=(InternationalBrand)inter;
			inter2.getInternationalBrandName();
		}
		
		if(brand instanceof DuplicateBrand)
		{
			Brand duplicate=new DuplicateBrand();
			duplicate.getBrandName();//Brand
			
			DuplicateBrand duplicate2=(DuplicateBrand)duplicate;
			duplicate2.getDuplicateBrandName();
		}
	}
}
