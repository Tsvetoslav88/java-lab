package datastructures.softunit.arrayList;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(6);
		
		for (Integer value : arrList) {
			System.out.println(value);
		}
	}
}
