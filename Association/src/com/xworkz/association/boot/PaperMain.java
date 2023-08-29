package com.xworkz.association.boot;

import com.xworkz.association.app.Paper;
import com.xworkz.association.app.Wood;

public class PaperMain {

	public static void main(String[] args) {
		
		String type="Color Paper";
		 Wood wood=new Wood();
		 
		 Paper paper=new Paper(type);
		 paper.setWood(wood);
		 paper.write();
		
	}

}
