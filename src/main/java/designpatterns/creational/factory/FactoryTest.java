package designpatterns.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		MobileFactory factory = new MobileFactory();
		
		Lenovo len = (Lenovo) factory.createMobile("len");
		len.baterryPower();
		
		Samsung sam = (Samsung) factory.createMobile("sam");
		sam.baterryPower();
	}

}
