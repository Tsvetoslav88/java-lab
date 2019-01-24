package java8.functions.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * You use a Consumer when you want to do something with a parameter but not return any-
 * thing. BiConsumer does the same thing except that it takes two parameters. 
 * 
 * @author tsvetoslav
 *
 */
public class TestConsumer {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		BiConsumer<Integer, String> b1 = (a, b) -> map.put(a, b); 
		
		b1.accept(1, "Ivan");
		
		System.out.println(map);
	}
}
