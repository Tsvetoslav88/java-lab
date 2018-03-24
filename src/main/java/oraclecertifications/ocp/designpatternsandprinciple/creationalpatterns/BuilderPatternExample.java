package oraclecertifications.ocp.designpatternsandprinciple.creationalpatterns;

import java.util.Arrays;
import java.util.List;

/**
 * Problem How do we create an object that requires numerous values to be set at the time
 * the object is instantiated?
 * @author cpt2tts
 *
 */

public class BuilderPatternExample {
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public BuilderPatternExample setAge(int age){
		this.age = age;
		return this;
	}
	
	public BuilderPatternExample setSpecies(String species){
		this.species = species;
		return this;
	}
	
	public BuilderPatternExample setFavoriteFoods(List<String> favoriteFoods){
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public ImmutableObjectExample build(){
		return new ImmutableObjectExample(species, age, favoriteFoods);
	}
	
	public static void main(String[] args) {
		ImmutableObjectExample flamingo = new BuilderPatternExample()
				.setFavoriteFoods(Arrays.asList("algae","insects"))
				.setSpecies("flamingo").build();
		
		System.out.println(flamingo.getSpecies());
	}
}
