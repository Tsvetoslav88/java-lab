package headfirstdesignpattern.factory.pizzaaf;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
<<<<<<< HEAD

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
=======
	 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}

}
