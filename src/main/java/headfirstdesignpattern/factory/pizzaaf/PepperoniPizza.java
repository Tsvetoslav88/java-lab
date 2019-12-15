package headfirstdesignpattern.factory.pizzaaf;

public class PepperoniPizza extends Pizza {
<<<<<<< HEAD

	PizzaIngredientFactory ingredientFactory;

	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
=======
	
	PizzaIngredientFactory ingredientFactory;
	 
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}

}
