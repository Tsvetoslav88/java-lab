package designpatterns.structural.bridge;

/**
 * Refine abstraction 2 in bridge pattern
 * @author tsvetoslav
 *
 */
public class Bike extends Vehicle{

	public Bike(VehicleType type1, VehicleType type2) {
		super(type1, type2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void purchase() {
		System.out.print("Bike");
		type1.book();
		type2.book();
		
	}

}
