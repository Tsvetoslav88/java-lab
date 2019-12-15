package headfirstdesignpattern.factory.pizzaaf;

public abstract class Pizza {

	String name;
<<<<<<< HEAD
=======
	
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
<<<<<<< HEAD

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

=======
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
<<<<<<< HEAD

=======
	
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
<<<<<<< HEAD
				if (i < veggies.length - 1) {
=======
				if (i < veggies.length-1) {
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
<<<<<<< HEAD

=======
	
>>>>>>> bd6c5790126fa3828daea10f00845ca784c0ccbd
}
