package oraclecertifications.ocp.functionalprogramming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamVsNonStreamImplementation {

	public static void main(String[] args) {
		// We wanted to get the first two names alphabetically that are four characters
		// long. In

		System.out.println("JAVA 7 style:");
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		List<String> filtered = new ArrayList<>();
		for (String name : list) {
			if (name.length() == 4)
				filtered.add(name);
		}
		Collections.sort(filtered);
		Iterator<String> iter = filtered.iterator();
		if (iter.hasNext())
			System.out.println(iter.next());
		if (iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("\nJAVA 8 (Stream) implementation:");
		List<String> stream = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		stream.stream().filter(n->n.length()==4).sorted().limit(2).forEach(System.out::println);
		

	}

}
