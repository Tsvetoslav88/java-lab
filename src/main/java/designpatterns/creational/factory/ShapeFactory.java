package designpatterns.creational.factory;

/**
 * The core factory pattern is a Factory class. The following code shows how to
 * create a Factory class for Shape objects.
 * 
 * The ShapeFactory class creates Shape object based on the String value passed
 * in to the getShape() method. If the String value is CIRCLE, it will create a
 * Circle object.
 * 
 * @author tstsvetk
 *
 */
public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
