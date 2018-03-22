package oraclecertifications.ocp.designpatternsandprinciple;

/**
 * In object-oriented design, we refer to object composition as the property of
 * constructing a class using references to other classes in order to reuse the
 * functionality of the other classes. In particular, the class contains the
 * other classes in the has-a sense and may delegate methods to the other
 * classes. Object composition should be thought of as an alternate to
 * inheritance and is often used to simulate polymorphic behavior that cannot be
 * achieved via single inheritance.
 * 
 * @author cpt2tts
 *
 */

class Flippers {
	public void flap() {
		System.out.println("The flippers flap back and forth");
	}
}

class WebbedFeet {
	public void kick() {
		System.out.println("The webbed feet kick to and from");
	}
}

public class ComposingObjectsExample {
	private final Flippers flippers;
	private final WebbedFeet webbedFeet;

	public ComposingObjectsExample() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}

	public void flap() {
		this.flippers.flap();
	}

	public void kick() {
		this.webbedFeet.kick();
	}
}
