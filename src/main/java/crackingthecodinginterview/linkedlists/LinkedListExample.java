package crackingthecodinginterview.linkedlists;

class Node<T> {
	T data;
	Node<T> next;
	Node<T> head;

	public Node(T d) {
		data = d;
		head = this;
	}

	void appendToTail(T d) {
		Node<T> end = new Node<T>(d);
		Node<T> n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	T deleteNode(T d) {
		Node<T> n = head;

		if (n.data == d) {
			head.next = head;
			return d;
		}

		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return d;
			}
			n = n.next;
		}

		return null;
	}
}

public class LinkedListExample {
	public static void main(String[] args) {
		Node<Integer> linkedList = new Node<Integer>(4);
		linkedList.appendToTail(5);
		linkedList.appendToTail(8);
		linkedList.appendToTail(9);
		linkedList.deleteNode(8);
		while (linkedList != null) {
			System.out.println(linkedList.data);
			linkedList = linkedList.next;
		}
	}
}
