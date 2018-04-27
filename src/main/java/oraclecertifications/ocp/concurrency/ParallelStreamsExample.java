package oraclecertifications.ocp.concurrency;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamsExample {
	public static void main(String[] args) {
		/////Creation of parallel stream///
		//parallel() - create a parallel stream is from an existing stream.
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel();
		//parallelStream() - create a parallel stream is from a Java collection class
		Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
	}
}
