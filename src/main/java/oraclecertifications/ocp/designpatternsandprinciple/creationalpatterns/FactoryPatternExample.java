package oraclecertifications.ocp.designpatternsandprinciple.creationalpatterns;

/**
 * Problem How do we write code that creates objects in which the precise type of the object
 * may not be known until runtime?
 * @author cpt2tts
 *
 */

abstract class Food{
	private int quantity;
	public Food(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public abstract void consumed();
}

class Hay extends Food{

	public Hay(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten: " + getQuantity());
	}
}

class Pellets extends Food{

	public Pellets(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consumed() {
		System.out.println("Pettlets eaten: " + getQuantity());
	}
}

class Fish extends Food{

	public Fish(int quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
	}
}

class FoodFactory{
	public static Food getFood(String animalName){
		switch (animalName) {
		case "zebra": return new Hay(100);
		case "rabbit": return new Pellets(5);
		case "goat": return new Pellets(100);
		case "polar bear": return new Fish(10);
		}
		// Good practice to throw an exception if no matching subclass could be found
		throw new UnsupportedOperationException("Unsupported animal: "+animalName);
	}
}

public class FactoryPatternExample {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}
}
