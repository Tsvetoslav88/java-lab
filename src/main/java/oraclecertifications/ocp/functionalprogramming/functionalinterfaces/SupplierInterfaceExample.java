package oraclecertifications.ocp.functionalprogramming.functionalinterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * A Supplier is used when you want to generate or supply values without taking any input.
 * @author cpt2tts
 *
 */
public class SupplierInterfaceExample {
	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		
		System.out.println(d1);
		System.out.println(d2);
		
		
		System.out.println();
		Supplier<ArrayList<String>> arr = ArrayList<String>::new;
		ArrayList<String> a1 = arr.get();
		System.out.println(a1);
	}
}
