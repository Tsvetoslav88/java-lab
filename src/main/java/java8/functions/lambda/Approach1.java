package java8.functions.lambda;

import java.util.Arrays;
import java.util.List;

//Create Methods That Search for Members That Match One Characteristic
public class Approach1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Ïvan");
		Person p2 = new Person();
		p2.setName("Dimitar");
		printPersonsOlderThan(Arrays.asList(p1, p2), 5);
	}

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}

	}
}
