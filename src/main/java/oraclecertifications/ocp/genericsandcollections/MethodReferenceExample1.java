package oraclecertifications.ocp.genericsandcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Method reference to an instance method of an object
 * @author cpt2tts
 *
 */

@FunctionalInterface
interface MyInterface{
	void display();
}

public class MethodReferenceExample1 {
	public void myMethod(){
		System.out.println("Instance Method"); 
	}
	
	public static void main(String[] args) {
		MethodReferenceExample1 example1 = new MethodReferenceExample1();
		// Method reference using the object of the class
		MyInterface ref = example1::myMethod;
		// Calling the method of functional interface  
		ref.display();  
		
	}
}
