package oraclecertifications.ocp.genericsandcollections.mapapis;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * computeIfPresent() calls the BiFunction if the requested key is found.
 * 
 * computeIfAbsent(), the functional interface runs only when the key isn�t present or is null
 * 
 * If the mapping function is called and returns null.
 * The call to computeIfPresent() removes the key from the map. 
 * The call to computeIfAbsent() doesn�t add a key.
 * 
 * @author cpt2tts
 * 
 *
 */

public class ComputeFunctionsExample {
	public static void main(String[] args) {
		
		System.out.println("*****Mapping Function is run when the key is found");
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		Integer sam = counts.computeIfPresent("Sam", mapper);
		
		System.out.println(counts); // {Jenny=2}
		System.out.println(jenny); // 2
		System.out.println(sam); // null
		
		System.out.println("*****Mapping Function is run when the key isn't present");
		Map<String, Integer> counts2 = new HashMap<>();
		counts2.put("Jenny", 15);
		counts2.put("Tom", null);
		
		Function<String, Integer> mapper2 = (k) -> 1;
		Integer jenny2 = counts2.computeIfAbsent("Jenny", mapper2); // 15
		Integer sam2 = counts2.computeIfAbsent("Sam", mapper2); // 1
		Integer tom2 = counts2.computeIfAbsent("Tom", mapper2); // 1
		System.out.println(counts2); // {Tom=1, Jenny=15, Sam=1}
		System.out.println(jenny2); // 2
		System.out.println(sam2); // null
		System.out.println(tom2); // null
		
		
		System.out.println("*****Mapping Function return null");
		Map<String, Integer> counts3 = new HashMap<>();
		counts3.put("Jenny", 1);
		counts3.computeIfPresent("Jenny", (k, v) -> null);
		counts3.computeIfAbsent("Sam", k -> null);
		System.out.println(counts3); // {}
	}
}
