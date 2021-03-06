package oraclecertifications.oca.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		// Java 7 and older style
		// print(animals, new CheckIfHopper()); // pass class that does check
		// Java 7 lambda expression
		print(animals, Animal::canHop);//Method reference
		print(animals, a -> a.canSwim());//Lambda expression

	}

	// Using our own interface
	// private static void print(List<Animal> animals, CheckTrait checker) {
	// for (Animal animal : animals) {
	// if (checker.test(animal)) // the general check
	// System.out.print(animal + " ");
	// }
	// System.out.println();
	// }

	// Using Predicate interface
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}

}
