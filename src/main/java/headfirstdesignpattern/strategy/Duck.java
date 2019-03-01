package headfirstdesignpattern.strategy;

public abstract class Duck {
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quckBehaviour;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quckBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuckBehaviour(QuackBehaviour quckBehaviour) {
		this.quckBehaviour = quckBehaviour;
	}
	
	
	
}
