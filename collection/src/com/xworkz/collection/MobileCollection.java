package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MobileCollection {

	public static void main(String[] args) {

		Collection<Long> mobiles = new ArrayList<Long>();

		Collections.addAll(mobiles, 9878986798l, 9865757575l, 8787875678l, 7575757575l, 8383838383l, 9292929292l,
				8374845758l, 8484848484l, 6767676767l, 6868686757l, 8394758475l, 9475847585l, 9745849494l, 9859485859l,
				9485768594l, 8484756575l, 8484848484l, 9836464646l, 6868686868l, 6464646494l, 9867575757l, 7575757575l,
				8485968797l, 9864774747l, 7346897586l, 6789457848l, 8383475845l, 8384887534l, 9487587884l, 9485787848l);

		Iterator<Long> mobileInstance = mobiles.iterator();

		while (mobileInstance.hasNext()) {
			Long mobileNumber = mobileInstance.next();
			System.out.println(mobileNumber);
		}

		System.out.println("\n....Size of Mobile Numbers..." + mobiles.size());

	}

}
