package oraclecertifications.ocp.functionalprogramming.streams;

import java.nio.file.attribute.GroupPrincipal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvanceStream {
	public static void main(String[] args) {
		//Linking Streams to the Underlying Data
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> stream = cats.stream();
		cats.add("KC");
		System.out.println(stream.count());//3
		System.out.println();
		
		
		/////Collectors///
		//Collecting Using Basic Collectors
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result); // lions, tigers, bears
		System.out.println();
		
		//Collecting into Maps
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = ohMy2.collect(Collectors.toMap(s->s, s->s.length()));
		System.out.println(map); // {lions=5, bears=5, tigers=6}
		
		Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map2 = ohMy3.collect(Collectors.toMap(String::length, k->k, (s1, s2) -> s1 + "," + s2));
		System.out.println(map2); // {5=lions,bears, 6=tigers}
		System.out.println();
		
		
		//////Collecting Using Grouping, Partitioning, and Mapping/////
		Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
		//Grouping by length in TreeMap as values are in Set
		TreeMap<Integer, Set<String>> map3 = ohMy4.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(map3); // {5=[lions, bears], 6=[tigers]}
		System.out.println();
		
		//Partitioning is a special case of grouping. With partitioning, there are only two possible groups true and false. Partitioning is like splitting a list into two parts
		Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map4 = ohMy6.collect(
		Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map4); // {false=[tigers], true=[lions, bears]}
		System.out.println();
		
		
	}
}
