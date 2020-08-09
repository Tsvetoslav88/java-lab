package java8.functions.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import java8.functions.lambda.Person.Sex;

//Use Lambda Expressions Throughout Your Application
public class Approach6 {

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

	public static void printPersonsOlderThan(List<Person> roster, Predicate<Person> tester,
	        Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}

	}
}
