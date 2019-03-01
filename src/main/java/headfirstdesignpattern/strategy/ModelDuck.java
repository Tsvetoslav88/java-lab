package headfirstdesignpattern.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.flyBehaviour = new FlyNoWay();
		this.quckBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
