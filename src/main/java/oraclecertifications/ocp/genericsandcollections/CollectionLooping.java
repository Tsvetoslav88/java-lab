package oraclecertifications.ocp.genericsandcollections;

import java.util.Arrays;
import java.util.List;

public class CollectionLooping {
	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Annie", "Ripley");
		cats.forEach(c->System.out.println(c));
		cats.forEach(System.out::println);
	}
}
