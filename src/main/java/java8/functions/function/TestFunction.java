package java8.functions.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * A Function is responsible for turning one parameter into a value of a potentially different type and returning it. 
 * Similarly, a BiFunction is responsible for turning two parameters into a value and returning it.
 * @author tsvetoslav
 *
 */
public class TestFunction {
	public static void main(String[] args) {
		
		Function<String, Integer> f = x->x.length(); 
		System.out.println(f.apply("Ivan"));
		
		BiFunction<String, String, String> biF = (x, y)->x.concat(y);
		System.out.println(biF.apply("Ivan ", "Ivanov"));
		
	}
}
