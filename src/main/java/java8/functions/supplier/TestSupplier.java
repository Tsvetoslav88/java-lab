package java8.functions.supplier;

import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<Person> supplier = () -> {
			return new Person("Ivan", 45, "Sofia");
		};
		
		Person p = supplier.get();
		System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getAddress());
		
	}
}
