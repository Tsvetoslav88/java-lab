package oraclecertifications.ocp.io;

import java.io.Serializable;


/**
 * transient keyword on the reference to the object, which will instruct the process serializing the object to skip it and avoid throwing a NotSerializableException .
 * @author tstsvetk
 *
 */
public class Animal implements Serializable {

	/**
	 * serialVersionUID is stored with the serialized object and assists during the deserialization
	 * process. The serialization process uses the serialVersionUID to identify uniquely
	 * a version of the class
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private int age;
	private char type;

	public Animal(String name, int age, char type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getType() {
		return type;
	}

	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
}
