package java8.functions.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate is often used when filtering or matching. Both are very common operations. 
 * A BiPredicate is just like a Predicate except that it takes two parameters instead of one. 
 * @author tsvetoslav
 *
 */
public class TestPredicate {

	public static void main(String[] args) {
		
		// Implement Predicate using style before Java 8
		Predicate<String> pOld = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.isEmpty();
			}
		};
		System.out.println(pOld.test("Ivan"));

		// Implement Predicate using Lambda expression - Java 8
		Predicate<String> p = x->x.isEmpty();
		System.out.println(p.test(""));
		
		BiPredicate<String, String> b = (x, y) ->x.contains(y);
		System.out.println(b.test("Ivan", "Iv"));
		
	}
	
}
