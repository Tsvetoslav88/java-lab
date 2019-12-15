package headfirstdesignpattern.factory.pizzaaf;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);
<<<<<<< HEAD

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("---- Making a " + pizza.getName() + " -----");
=======
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
<<<<<<< HEAD
		return pizza;
	}

=======
		
		return pizza;
	}
	
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
}
