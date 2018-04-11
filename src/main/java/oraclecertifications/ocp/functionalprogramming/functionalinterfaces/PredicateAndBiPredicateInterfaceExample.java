package oraclecertifications.ocp.functionalprogramming.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate is often used when filtering or matching. Both are
 * very common operations. A BiPredicate is just like a Predicate except that it takes two
 * parameters instead of one.
 * @author cpt2tts
 *
 */
public class PredicateAndBiPredicateInterfaceExample {
	public static void main(String[] args) {
		
		System.out.println("Predicate function");
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		System.out.println("\n");
		
		System.out.println("BiPredicate function");
		BiPredicate<String, String> biP1 = String::startsWith;
		BiPredicate<String, String> biP2 = (string, prefix) -> string.startsWith(prefix);
		
		System.out.println(biP1.test("chicken", "chick"));
		System.out.println(biP2.test("chicken", "chick"));
		
	}
}
