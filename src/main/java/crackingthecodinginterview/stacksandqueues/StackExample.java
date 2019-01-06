package crackingthecodinginterview.stacksandqueues;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		super();
		this.data = data;
	}

}

class Stack {
	Node<Integer> top;

	Object pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}

	void push(Integer item) {
		Node<Integer> t = new Node<Integer>(item);
		t.next = top;
		top = t;
	}
}

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(11);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
