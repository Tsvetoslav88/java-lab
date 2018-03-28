package oraclecertifications.ocp.genericsandcollections;

interface Shippable<T> {
	void ship(T t);
}

public class GenericInterfaceExample {
	public static void main(String[] args) {
		Shippable<String> ship = new ShippableAbstractCrate<String>();
		ship.ship("Generic interface implementation");
	}
}

class ShippableAbstractCrate<U> implements Shippable<U> {
	public void ship(U t) {
		System.out.println(t);
	}
}