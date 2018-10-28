package designpatterns.creational.builder;

public class BuilderPattern {
	public static void main(String[] args) {
		// Creating object using Builder pattern in java
		Cake whiteCake = new Cake.CakeBuilder().suger(1).butter(0.5).milk(0.5).build();

		// Cake is ready to eat
		System.out.println(whiteCake);
	}
}
