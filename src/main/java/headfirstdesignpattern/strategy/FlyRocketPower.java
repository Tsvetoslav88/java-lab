package headfirstdesignpattern.strategy;

public class FlyRocketPower implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

}
