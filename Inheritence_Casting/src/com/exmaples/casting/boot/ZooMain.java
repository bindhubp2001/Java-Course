package com.exmaples.casting.boot;

import com.exmaples.casting.app4.*;
import com.exmaples.casting.util.ZooUtil;

public class ZooMain {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		
		StateZoo stateZoo=new StateZoo();
		
		NationalZoo nationalZoo=new NationalZoo();
		
		ZooUtil util=new ZooUtil();
		System.out.println("Calling run method with zoo ref");
		util.run(zoo);
		System.out.println("---------------------------------");
		
		ZooUtil util2=new ZooUtil();
		System.out.println("Calling run method with State zoo ref");
		util2.run(stateZoo);
		System.out.println("---------------------------------");
		
		ZooUtil util3=new ZooUtil();
		System.out.println("Calling run method with National zoo ref");
		util3.run(nationalZoo);
		System.out.println("---------------------------------");

	}

}
