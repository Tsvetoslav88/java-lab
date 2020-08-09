package java8.functions.lambda;

import java.util.Arrays;
import java.util.List;

import java8.functions.lambda.Person.Sex;

//Specify Search Criteria Code in a Local Class
public class Approach2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setGender(Sex.MALE);
		p1.setName("Ïvan");
		Person p2 = new Person();
		p2.setGender(Sex.MALE);
		p2.setName("Dimitar");

		printPersonsOlderThan(Arrays.asList(p1, p2), new CheckPersonEligibleForSelectiveService());
	}

	public static void printPersonsOlderThan(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}

	}

}
