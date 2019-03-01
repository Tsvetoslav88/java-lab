package headfirstdesignpattern.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehaviour = new FlyWithWings();
		this.quckBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");

	}

}
