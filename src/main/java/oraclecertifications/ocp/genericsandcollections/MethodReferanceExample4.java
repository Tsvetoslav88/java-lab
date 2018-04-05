package oraclecertifications.ocp.genericsandcollections;

/**
 * Method reference to a constructor
 * 
 * @author cpt2tts
 *
 */

interface MyInterface2 {
	Hello display(String say);
}

class Hello {
	public Hello(String say) {
		System.out.print(say);
	}
}

public class MethodReferanceExample4 {
	public static void main(String[] args) {
		// Method reference to a constructor
		MyInterface2 ref = Hello::new;
		ref.display("Hello World!");
	}
}
