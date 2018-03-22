package oraclecertifications.ocp.advancedclassdesign;

public class StaticNestedClassExample {

	static class Nested{
		private int price = 6;
	}
	
	public static void main(String[] args) {
		Nested test = new Nested();
		System.out.println(test.price);
	}
	
}
