package oraclecertifications.ocp.functionalprogramming.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * A Function is responsible for turning one parameter into a value of a potentially different
 * type and returning it. Similarly, a BiFunction is responsible for turning two parameters
 * into a value and returning it.
 * @author cpt2tts
 *
 */
public class FunctionAndBiFunctionInterfaceExample {
	public static void main(String[] args) {
		System.out.println("Function interface");
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("cluck"));
		System.out.println(f2.apply("cluck"));
		
		System.out.println("\n");
		System.out.println("BiFunction interface");
		BiFunction<String, String, String> biF1 = String::concat;
		BiFunction<String, String, String> biF2 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(biF1.apply("Hello ", "world"));
		System.out.println(biF2.apply("Hello ", "world"));
	}
}
