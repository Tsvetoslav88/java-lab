package java8.functions.lambda;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import java8.functions.lambda.Person.Sex;

//Use Generics More Extensively
public class Approach7 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setGender(Sex.MALE);
		p1.setName("Ïvan");
		Person p2 = new Person();
		p2.setGender(Sex.MALE);
		p2.setName("Dimitar");

		printPersonsOlderThan(Arrays.asList(p1, p2),
		        p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25, p -> p.getName(),
		        name -> System.out.println(name));
	}

	public static <X, Y> void printPersonsOlderThan(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper,
	        Consumer<Y> block) {
		for (X p : source) {
			if (tester.test(p)) {
				Y data = mapper.apply(p);
				block.accept(data);
			}
		}
	}
}
