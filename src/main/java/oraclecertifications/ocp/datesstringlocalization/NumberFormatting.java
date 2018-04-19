package oraclecertifications.ocp.datesstringlocalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatting {

	public static void main(String[] args) {
		
		/////Formatting - formats the given number based on the locale associated with the NumberFormat object
		//Format number
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));//266,666 -> US format
		
		//Format price
		double price = 48;
		NumberFormat us2 = NumberFormat.getCurrencyInstance();
		System.out.println(us2.format(price));//$48.00
		
		//Parsing - for parsing a String into a number using a specifi c locale.
		String s = "40.45";
		try {
			System.out.println(us.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 40.45

	}

}
