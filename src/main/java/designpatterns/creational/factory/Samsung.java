package designpatterns.creational.factory;

public class Samsung implements IMobile {

	@Override
	public void cost() {
		System.out.println("Samsung Cost starts from 6000");

	}

	@Override
	public void pictureCapacity() {
		System.out.println("Samsung camera capacity starts from 4 MP");

	}

	@Override
	public void baterryPower() {
		System.out.println("Samsung baterry power starts from 12000 MPh");

	}

}
