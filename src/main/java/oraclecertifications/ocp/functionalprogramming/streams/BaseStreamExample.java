package oraclecertifications.ocp.functionalprogramming.streams;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * A stream in Java is a sequence of data. A stream pipeline is the operations that run on a
 * stream to produce a result. Think of a stream pipeline as an assembly line in a factory.
 * 
 * There are three parts to a stream pipeline:
 * - Source: Where the stream comes from.
 * - Intermediate operations: Transforms the stream into another one. There can be as few
 * or as many intermediate operations as you'd like. Since streams use lazy evaluation, the
 * intermediate operations do not run until the terminal operation runs.
 * - Terminal operation: Actually produces a result. Since streams can be used only once,
 * the stream is no longer valid after a terminal operation completes.
 * 
 * @author tstsvetk
 *
 */
public class BaseStreamExample {

	public static void main(String[] args) {
		/////////////////////Creation Stream Source////////////////////////
		Stream<String> empty = Stream.empty(); // count = 0
		Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2
		List<String> list = Arrays.asList("a", "b", "c");

		
		//////////////////Common Terminal Operations//////////////////////
		//count() - The count() method determines the number of elements in a finite stream
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count());//3
		System.out.println();
		
		//min() and max() - methods allow you to pass a custom comparator and find the smallest
		//or largest value in a finite stream according to that sort order.
		Stream<String> s1 = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = s1.max((first, second) -> first.length() - second.length());
		min.ifPresent(System.out::println);
		System.out.println();
		
		//findAny() and findFirst() - The findAny() and findFirst() methods return an element of the stream unless the stream
		//is empty. If the stream is empty, they return an empty Optional. findAny() is useful when you are working with a parallel stream.
		Stream<String> infinite = Stream.generate(()->"chim"); 
		infinite.findAny().ifPresent(System.out::println);
		System.out.println();
		
		//allMatch() , anyMatch() and noneMatch() - methods search a stream and return information about how the stream pertains to the predicate.
		List<String> list1 = Arrays.asList("monkey", "2", "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list1.stream().anyMatch(pred)); // true -> because two of the three elements match
		System.out.println(list.stream().allMatch(pred)); // false -> because one doesn�t match
		System.out.println(list.stream().noneMatch(pred)); // false -> because one matches
		System.out.println();
		
		//forEach()
		Stream<String> s2 = Stream.of("Monkey", "Gorilla", "Bonobo");
		s2.forEach(System.out::println);
		System.out.println();
		
		//reduce() - The reduce() method combines a stream into a single object.
		Stream<Integer> s3 = Stream.of(1, 3, 5);
		Integer number = s3.reduce(1, (num1 , num2) -> num1*num2);
		System.out.println(number);
		System.out.println();
		
		//collect() - method is a special type of reduction called a mutable reduction. It is
		//more efficient than a regular reduction because we use the same mutable object while	accumulating.
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);
		
		
		
		//////////////////Common Intermediate Operations//////////////////////////////
		//filter() - returns a Stream with elements that match a given expression
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.filter(x -> x.startsWith("m")).forEach(y->System.out.println(y));
		System.out.println();
		
		//distinct() - returns a stream with duplicate values removed
		Stream<String> s5 = Stream.of("duck", "duck", "duck", "goose");
		s5.distinct().forEach(System.out::println);
		System.out.println();
		
		//limit() and skip() - make a Stream smaller. They could make a finite stream
		//smaller, or they could make a finite stream out of an infinite stream.
		Stream<Integer> s6 = Stream.iterate(1, x -> x +1);
		s6.skip(5).limit(2).forEach(System.out::print);//67
		System.out.println("\n");
		
		//map() - creates a one-to-one mapping from the elements in the stream to the elements
		//of the next step in the stream.
		//NOTE:The map() method on streams is for transforming data
		Stream<String> s7 = Stream.of("monkey", "gorilla", "bonobo");
		s7.map(v->v.length()).forEach(w->System.out.print(w));
		System.out.println("\n");//676
		
		//flatMap() - takes each element in the stream and makes any elements it contains
		//top-level elements in a single stream. This is helpful when you want to remove empty
		//elements from a stream or you want to combine a stream of lists.
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> s8 = Stream.of(zero, one, two);
		s8.flatMap(l->l.stream()).forEach(System.out::println);
		System.out.println("\n");
		
		//sorted() - returns a stream with the elements sorted.
		Stream<String> s9 = Stream.of("brown bear-", "grizzly-");
		s9.sorted((first, second)->first.length()-second.length()).forEach(System.out::println);
		System.out.println();
		
		//peek() - It is useful for debugging because it
		//allows us to perform a stream operation without actually changing the stream
		//The most common use for peek() is to output the contents of the stream as it goes by.
		Stream<String> s10 = Stream.of("black bear", "brown bear", "grizzly");
		long count = s10.filter(q->q.startsWith("g")).peek(System.out::println).count();
		
		
		
	}

}
