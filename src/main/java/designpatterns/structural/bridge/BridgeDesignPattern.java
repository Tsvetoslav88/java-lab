package designpatterns.structural.bridge;

public class BridgeDesignPattern {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new NewVehicle(), new OldVehicle());
		vehicle1.purchase();
		
		System.out.println();
		
		Vehicle vehicle2 = new Bike(new NewVehicle(), new OldVehicle());
		vehicle2.purchase();
	}
}
