package oraclecertifications.ocp.designpatternsandprinciple.creationalpatterns;

/**
 * Problem How do we create an object in memory only once in an application and have it
 * shared by multiple classes?
 * @author cpt2tts
 *
 */

public class SingletonPatternExample {
	private int quantity = 0;
	private SingletonPatternExample(){}
	
	private static final SingletonPatternExample instance = new SingletonPatternExample();
	
	
	//There is other way to make Singleton Instance in static block
	/*
	 * private static final SingletonPatternExample instance;
	 * 
	 * static{
	 *    instance = new SingletonPatternExample();
	 * }
	 */
	
	public static SingletonPatternExample getInstance(){
		return instance;
	}
	
	public synchronized void addHay(int amount){
		quantity+=amount;
	}
	
	public synchronized boolean removeHay(int amount){
		if(quantity < amount)
			return false;
		quantity-=amount;
		return true;
	}
	
	public synchronized int getHayQuantity(){
		return quantity;
	}
	
	
	public static void main(String[] args) {
		int amountNeeded = 15;
		SingletonPatternExample heyStorage = SingletonPatternExample.getInstance();
		if(heyStorage.getHayQuantity() < amountNeeded){
			heyStorage.addHay(amountNeeded + 10);
		}
		boolean fed = heyStorage.removeHay(amountNeeded);
		if(fed){
			System.out.println();
		}
	}
}
