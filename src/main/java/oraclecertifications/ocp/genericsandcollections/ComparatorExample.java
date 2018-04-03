package oraclecertifications.ocp.genericsandcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Duck implements Comparable<Duck> {

	private String name;
	private int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	public int compareTo(Duck d) {
		return name.compareTo(d.name);
	}


}

public class ComparatorExample{
	
	
	public static void main(String[] args) {
		Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();
		
		
		List<Duck> ducks = new ArrayList<>();

		
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
		Collections.sort(ducks);
		System.out.println(ducks); // [Puddles, Quack]
		Collections.sort(ducks, byWeight);
		System.out.println(ducks); // [Quack, Puddles]
	}


	

}
