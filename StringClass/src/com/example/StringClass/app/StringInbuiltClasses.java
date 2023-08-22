package com.example.StringClass.app;

import java.util.Date;
import java.time.*;

public class StringInbuiltClasses {
	public static void main(String[] args) {
		String value = "Rajajinagar-Banglore";

		System.out.println("Value at 12 : " + value.charAt(12));

		System.out.println("-------------------");

		String[] array = value.split("a");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("-------------------");

		String[] array2 = value.split("n", 2);

		for (int i = 0; i < array2.length; i++) {
			System.out.println("" + array2[i]);
		}

		System.out.println("-------------------");

		String value1 = value.concat("-X-Workz");
		System.out.println(value1);

		System.out.println("-------------------");

		int value2 = value.compareTo("Banglore");
		System.out.println(value2);

		System.out.println("-------------------");

		System.out.println(value.substring(12));

		System.out.println("-------------------");

		System.out.println(value.substring(6, 11));

		System.out.println("-------------------");

		System.out.println(value.isEmpty());

		System.out.println("-------------------");

		System.out.println(value.length());

		System.out.println("-------------------");

		System.out.println(value.startsWith("R"));

		System.out.println("-------------------");

		System.out.println(value.endsWith("a"));

		System.out.println("-------------------");

		System.out.println(value.equalsIgnoreCase("rajajinagar-banglore"));

		System.out.println("-------------------");

		System.out.println(value.equals("Rajajinagar-Banglore"));

		System.out.println("-------------------");

		System.out.println(value.toUpperCase());

		System.out.println("-------------------");

		System.out.println(value.toCharArray());

		System.out.println("-------------------");

		System.out.println(value.isEmpty());

		System.out.println("-------------------");

		System.out.println(value.indexOf(66));

		System.out.println("-------------------");

		String val = "       Google              ";

		System.out.println(val.trim());

		System.out.println("****************JAVA.UTIL.DATE METHODS*****************");

		Date date = new Date(2001, 22, 10);
		Date date2 = new Date(2001, 22, 20);

		System.out.println(date2.after(date));

		Date date3 = new Date(2005, 22, 10);

		System.out.println(date.before(date3));

		System.out.println(date.clone());

		System.out.println(date2.compareTo(date));

		System.out.println(date.getTime());

		System.out.println("****************JAVA.TIME.LOCALDATE METHODS*****************");

		System.out.println(LocalDate.now());

		System.out.println(LocalDate.of(2001, 10, 22));

		System.out.println(LocalDate.parse("2007-12-03"));

		System.out.println(LocalDate.ofYearDay(2023, 19));

		System.out.println(LocalDate.ofEpochDay(10));

		System.out.println("****************JAVA.TIME.LOCALDATETIME METHODS*****************");

		System.out.println(LocalDateTime.now());

		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));

		System.out.println(LocalDateTime.of(2023, 10, 22, 10, 20));

		System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(100), ZoneId.systemDefault()));

		System.out.println(LocalDateTime.of(2023, 10, 22, 12, 0, 0));

		System.out.println("****************JAVA.LANG.THREAD METHODS*****************");

		System.out.println(Thread.activeCount());

		System.out.println(Thread.interrupted());

		System.out.println(Thread.currentThread());

		System.out.println(Thread.getDefaultUncaughtExceptionHandler());

		System.out.println(Thread.holdsLock(val));

		System.out.println("****************JAVA.LANG.SYSTEM METHODS*****************");

		System.out.println(System.lineSeparator());

		System.out.println(System.clearProperty(val));

		System.out.println(System.nanoTime());

		System.out.println(System.getenv(val));

		System.out.println(System.identityHashCode(val));

	}
}
