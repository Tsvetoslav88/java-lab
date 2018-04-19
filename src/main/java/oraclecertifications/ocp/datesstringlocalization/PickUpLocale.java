package oraclecertifications.ocp.datesstringlocalization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

/*
 * Internationalization -  is the process of designing your program so it can be adapted. This
 * 	involves placing strings in a property file and using classes like DateFormat so that the right
 *	format is used based on user preferences
 * Localization -  means actually supporting multiple locales. Oracle defines a locale as “a
 * 	specific geographical, political, or cultural region.”
 * Resource bundle - contains the local specific objects to be used by a program(can be in a property fi le or in a Java class)
 * Property file - is a file in a specific format with key/value pairs
 */
public class PickUpLocale {

	public static void main(String[] args) {
		//// Locale////
		Locale locale = Locale.getDefault();// Get default locale
		System.out.println(locale);// en_US
		// Create custom locale
		System.out.println(Locale.GERMAN);// Using constant
		System.out.println(new Locale("hi", "IN"));// Using constructor
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();// Using builder design pattern
		System.out.println(l1);
		System.out.println();

		

	}

	
}


