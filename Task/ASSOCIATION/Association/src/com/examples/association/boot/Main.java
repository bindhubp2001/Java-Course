package com.examples.association.boot;

import com.examples.association.app.Constituency;
import com.examples.association.app.IndiraCanteen;
import com.examples.association.app.Minister;

public class Main {
		public static void main(String[] args) {
			System.out.println("Running Main Class");
			System.out.println("--------------------");
			
			
			Minister minister = new Minister();
			
			System.out.println("Minister Name : "+minister.name);
			System.out.println("Miister Experience : "+minister.experinece);
			
			//Association --> Minister has a Constituency
			Constituency constituency = minister.constituency;
			
			System.out.println("Constituency Number : "+constituency.number);
			System.out.println("Constituency Population : "+constituency.population);
			
			//Association --> Constituency Minister has a IndiraCanteen
			IndiraCanteen canteen = constituency.canteen;
			
			System.out.println("Breakfast Time : "+canteen.breakFastPrice);
			System.out.println("Lunch Time "+canteen.lunchPrice);
		}
}
