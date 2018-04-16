package oraclecertifications.ocp.functionalprogramming.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		
		//Convert from Another stream type to primitive
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.mapToInt(x -> x).sum());
		
		//Generate sequences from 0 to 6
		IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
		count.forEach(System.out::println);
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		System.out.println();
		
		//Create Double primitive type
		DoubleStream varargs = DoubleStream.of (1.0, 1.1, 1.2);
		System.out.println();
		varargs.forEach(System.out::println);
		System.out.println();
		
		//Conver from String object type to Int primitive type
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());
		
		//Optional primitive Stream
		IntStream intStream2 = IntStream.of(1, 10);
		OptionalDouble optional = intStream2.average();//NOTE: The difference is that OptionalDouble is for a primitive and
													   //      Optional<Double> is for the Double wrapper class
		System.out.println(optional.getAsDouble());
		//Get min element from Primitive Int
		IntStream intStream3 = IntStream.of(1, 10);
		OptionalInt optional2 = intStream3.min();
		System.out.println(optional2.getAsInt());
	}

}
