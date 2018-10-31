package designpatterns.structural.bridge;

/**
 * Concrete implementation 2 for bridge pattern
 * @author tsvetoslav
 *
 */
public class OldVehicle implements VehicleType{

	@Override
	public void book() {
		System.out.print(" Old Vehicle");
	}
	
}
