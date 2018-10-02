package oraclecertifications.ocp.exceptionsandassertions;

/**
 * Assertions are used for debugging purposes, allowing you to verify that something that you think is true during the coding phase is actually true at runtime.
 * we enable assertions by running the following example with the command "java ea Assertions"
 * java -ea:com.wiley.demos... -da:com.wiley.demos.TestColors my.programs.Main -> enable assertions for all classes and subclasses in demos but disable  for TestColors class
 * @author tstsvetk
 *
 */
public class Assertions {
	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0;
		System.out.println(numGuests);
	}
}
