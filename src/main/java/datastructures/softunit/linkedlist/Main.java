package datastructures.softunit.linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); 

		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);

		for (Integer item : list) {
			System.out.println(item);
		}
	}
}
