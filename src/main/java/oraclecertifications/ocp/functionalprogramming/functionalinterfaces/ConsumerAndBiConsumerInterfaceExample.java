package oraclecertifications.ocp.functionalprogramming.functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * You use a Consumer when you want to do something with a parameter but not return anything.
BiConsumer does the same thing except that it takes two parameters.
 * @author cpt2tts
 *
 */
public class ConsumerAndBiConsumerInterfaceExample {
	public static void main(String[] args) {
		System.out.println("Consumer");
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Method referance");
		c2.accept("Lambda expression");
		
		System.out.println("\n");
		
		System.out.println("BiConsumer");
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map);
		
	}
}
