package oraclecertifications.ocp.genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class MethodReferanceExample {
	public static void main(String[] args) {
		 List names = new ArrayList();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(o -> System.out.println(o));//Lambda
	      System.out.println();
	      names.forEach(System.out::println);//Method referance
	      
	}
}
