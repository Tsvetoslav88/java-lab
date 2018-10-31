package designpatterns.structural.bridge;

/**
 * Refine abstraction 1 in bridge pattern
 * @author tsvetoslav
 *
 */
public class Car extends Vehicle{

	public Car(VehicleType type1, VehicleType type2) {
		super(type1, type2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void purchase() {
		System.out.print("Car");
		type1.book();
		type2.book();
	}

}
