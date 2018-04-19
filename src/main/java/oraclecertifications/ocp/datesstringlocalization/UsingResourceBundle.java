package oraclecertifications.ocp.datesstringlocalization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class UsingResourceBundle {
	public static void main(String[] args) {
		// Using Property File Resource Bundle
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
		printProperties(us);
		System.out.println();
		printProperties(france);
		System.out.println();

		// Create Custom Resource bundle
		ResourceBundle rb = ResourceBundle.getBundle("oraclecertifications.ocp.datesstringlocalization.Zoo", Locale.US);
		System.out.println(rb.getObject("hello"));
	}

	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("oraclecertifications/ocp/datesstringlocalization/Zoo", locale);

		// Get set of keys
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k.toUpperCase() + " " + rb.getString(k)).forEach(System.out::println);

		// Converting Resource to Property
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));

		// System.out.println(rb.getString("hello"));
		// System.out.println(rb.getString("open"));
	}

}

class Zoo_en extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] { { "hello", "Hello" }, { "open", "The zoo is open" } };
	}
}