package headfirstdesignpattern.factory.pizzaaf;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
<<<<<<< HEAD

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
=======
	 
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}
<<<<<<< HEAD
=======

>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
}
