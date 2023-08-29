package com.xworkz.association.boot;

import com.xworkz.association.app.Pant;
import com.xworkz.association.app.Zip;

public class PantMain {

	public static void main(String[] args) {
		String style="Cargos";
		
		Zip zip=new Zip();
		
		Pant pant=new Pant(style);
		pant.setZip(zip);
		pant.wash();

	}

}
