package oraclecertifications.ocp.genericsandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMergeExample {
	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1: v2;
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);// {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny);// Bus Tour - It's longer than Skyride and leaves it
		System.out.println(tom);// Skyride - It's shorter than Skyride and replaces it
		
		System.out.println();
		
		//If the mapping function is called and returns null, the key is removed from the map when this happens:
		BiFunction<String, String, String> mapperNull = (v1, v2) -> null;
		Map<String, String> favoritesNull = new HashMap<>();
		favoritesNull.put("Jenny", "Bus Tour");
		favoritesNull.put("Tom", "Bus Tour");
		
		favoritesNull.merge("Jenny", "Skyride", mapperNull);
		favoritesNull.merge("Sam", "Skyride", mapperNull);
		System.out.println(favoritesNull); // {Tom=Bus Tour, Sam=Skyride}
	}
}
