package oraclecertifications.ocp.genericsandcollections;

import java.util.Arrays;

/**
 * Method reference to an instance method of an arbitrary object of a particular type
 * @author cpt2tts
 *
 */

public class MethodReferanceExample3 {
	public static void main(String[] args) {
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		
	}
}
