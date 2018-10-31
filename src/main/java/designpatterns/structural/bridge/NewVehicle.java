package designpatterns.structural.bridge;

/**
 * Concrete implementation 1 for bridge pattern 
 * @author tsvetoslav
 *
 */
public class NewVehicle implements VehicleType {

	@Override
	public void book() {
		System.out.print(" New vehicle");
	}

}
