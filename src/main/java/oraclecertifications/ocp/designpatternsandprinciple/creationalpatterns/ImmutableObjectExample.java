package oraclecertifications.ocp.designpatternsandprinciple.creationalpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem How do we create read-only objects that can be shared and used by multiple classes?
 * @author cpt2tts
 *
 */

public class ImmutableObjectExample {
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	public ImmutableObjectExample(String species, int age, List<String> favoriteFoods){
		this.species = species;
		this.age = age;
		if(favoriteFoods == null){
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<>(favoriteFoods);
	}
	
	public String getSpecies(){
		return this.species;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public int getFavoriteFoodsCount(){
		return this.favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index){
		return favoriteFoods.get(index);
	}
}
