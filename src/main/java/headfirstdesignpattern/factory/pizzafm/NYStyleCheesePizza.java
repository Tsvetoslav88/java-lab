package headfirstdesignpattern.factory.pizzafm;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Daugh";
		sauce = "Marinara Sauce";
		
		toppings.add("Grated Riggiano Cheese");
	}
}
