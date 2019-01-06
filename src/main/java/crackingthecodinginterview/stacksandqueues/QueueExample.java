package crackingthecodinginterview.stacksandqueues;

class Node2<T> {
	T data;
	Node2<T> next;

	public Node2(T data) {
		super();
		this.data = data;
	}

}

class Queue {

	Node2<Integer> head, tail;

	void enqueue(Integer item) {
		if (head == null) {
			tail = new Node2<Integer>(item);
			head = tail;
		} else {
			tail.next = new Node2<Integer>(item);
			tail = tail.next;
		}
	}

	public Integer dequeue() {
		if (head != null) {
			Integer element = head.data;
			head = head.next;
			return element;
		}

		return null;
	}

}

public class QueueExample {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(8);
		queue.enqueue(3);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
