package headfirstdesignpattern.factory.pizzaaf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
<<<<<<< HEAD
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
=======
		Veggies veggies[] = { new BlackOlives(), 
                new Spinach(), 
                new Eggplant() };
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
