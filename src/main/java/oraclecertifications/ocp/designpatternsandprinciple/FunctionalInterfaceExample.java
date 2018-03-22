package oraclecertifications.ocp.designpatternsandprinciple;


class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim){
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop(){ return this.canHop;}
	public boolean canSwim(){ return this.canSwim;}
	public String toString(){ return this.species;}
	
}

interface Predicate<T>{
	public boolean test(T a);
}

public class FunctionalInterfaceExample {
	private static void print(Animal animal, Predicate<Animal> trait){
		if(trait.test(animal)){
			System.out.println(animal);
		}
	}
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}
