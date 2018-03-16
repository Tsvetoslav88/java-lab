package oraclecertifications.ocp.advancedclassdesign;

class Animal {
}

public class InstanceOfExample {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		System.out.println(d instanceof Animal);// true

		///
		Animal a = new Dog1();
		Dog1.method(a);
	}
}

class Dog1 extends Animal {// Dog inherits Animal

	static void method(Animal a) {

		if (a instanceof Dog1) {
			Dog1 d = (Dog1) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}
}
