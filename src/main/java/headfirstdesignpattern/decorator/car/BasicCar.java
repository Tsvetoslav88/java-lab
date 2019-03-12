package headfirstdesignpattern.decorator.car;

/**
 * Component Implementation – The basic implementation of the component interface. 
 * We can have BasicCar class as our component implementation.
 * @author tsvetoslav
 *
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Basic Car");

	}

}
