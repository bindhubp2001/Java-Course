package com.xworkz.cracker.Runner;

import com.xworkz.cracker.constants.ExceptionCode;
import com.xworkz.cracker.constants.ExceptionMessage;
import com.xworkz.cracker.constants.MovieDIscount;
import com.xworkz.cracker.constants.MovieGST;
import com.xworkz.cracker.constants.MoviePrice;
import com.xworkz.cracker.constants.TrainPrice;
import com.xworkz.cracker.constants.VenderGST;
import com.xworkz.cracker.constants.VendorSerialNumber;
import com.xworkz.cracker.dto.ExceptionDTO;
import com.xworkz.cracker.dto.MovieDTO;
import com.xworkz.cracker.dto.TrainDTO;
import com.xworkz.cracker.dto.VendorDTO;

public class Runner {

	public static void main(String[] args) {

		VendorDTO dto=new VendorDTO("Ravi", VenderGST.PURPLE,VendorSerialNumber.SUGAR);
		
		System.out.println(dto);
		System.out.println(VenderGST.SUGAR.getGstNumber());
		System.out.println(VendorSerialNumber.PLUM.getSerialNumber());

		System.out.println("-----------------------------");
		
		TrainDTO dto2=new TrainDTO("Indian Express", TrainPrice.TWO_THOUSAND);
		System.out.println(dto2);
		System.out.println(TrainPrice.THREE_THOUSAND.getCost());

		System.out.println("-----------------------------");

		MovieDTO dto3=new MovieDTO("OpenHeimer", MoviePrice.SIX_HUNDRED, MovieDIscount.SSE, MovieGST.TOP_GUN);
		System.out.println(dto3);
		System.out.println(MovieDIscount.SSE.getDiscount());
		System.out.println(MovieGST.TOP_GUN.getGst());
		System.out.println(MoviePrice.THREE_HUNDRED.getPrice());
		
		System.out.println("-----------------------------");

		ExceptionDTO dto4=new ExceptionDTO(ExceptionCode.ARITHMETIC_EXCEPTION, ExceptionMessage.ARITHMETIC_EXCEPTION);
		System.out.println(dto4);
		System.out.println(ExceptionCode.ARITHMETIC_EXCEPTION.getCode());
		System.out.println(ExceptionMessage.NULL_POINTER_EXCEPTION.getMsg());
		
		
	}

}
