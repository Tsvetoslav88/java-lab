package oraclecertifications.ocp.functionalprogramming;

import java.util.Optional;

/**
 * An Optional is created using a factory. You can
 * either request an empty Optional or pass a value for the Optional to wrap. Think of an
 * Optional as a box that might have something in it or might instead be empty
 * @author cpt2tts
 *
 */
public class OptionalExample {

	public static Optional<Double> avarage(int... scores){
		if(scores.length == 0) return Optional.empty();
		
		int sum = 0;
		for(int score: scores) sum+=score;
		return Optional.of((double) sum / scores.length);
	}
	
	public static void main(String[] args) {
		Optional<Double> opt = avarage(90, 100);
		if(opt.isPresent()) //checks whether the Optional actually contains a value.
			System.out.println(opt.get()); // 95.0
		
		opt.ifPresent(System.out::println);//We want something done if a value is present
		
		//The other methods allow you to specify what to do if a value isn't present
		Optional<Double> opt2 = avarage();
		System.out.println(opt2.orElse(Double.NaN));//you can return a specific value or variable
		System.out.println(opt2.orElseGet(() -> Math.random()));//using a Supplier to generate a value at runtime to return instead
		System.out.println(opt2.orElseThrow(() -> new IllegalStateException()));//shows using a different Supplier to create an exception that should be thrown
		
	}

}
