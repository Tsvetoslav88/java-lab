package datastructures.softunit.linkedlist;

import java.util.Iterator;

public class LinkedList<E>  implements Iterable<E> {

	private int size;
	private Node head;
	private Node tail;

	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
		setSize(0);
	}

	public int size() {
		return this.size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public void addFirst(E item) {

		Node newNode = new Node(item);

		if (size() == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.size++;
	}

	public void addLast(E item) {

		Node newNode = new Node(item);

		if (size() == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.size++;
	}

	@SuppressWarnings("unchecked")
	public E removeFirst() {
		// Node oldNode = this.head;
		if (size == 0) {
			throw new UnsupportedOperationException();
		}

		E element = (E) this.head.value;
		if (size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}

		this.size--;
		return element;
	}

	public E removeLast() {
		if(size == 0){
			throw new UnsupportedOperationException();
		}
		
		@SuppressWarnings("unchecked")
		E element = (E) this.tail.value;
		if(size == 1){
			this.head = null;
			this.tail = null;
		}else{
			Node parent = this.head;
			while(parent.next != this.tail){
				parent = parent.next;
			}
			parent.next = null;
			this.tail = parent;
			
		}
		this.size--;
		return element;
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> it = new Iterator<E>() {

			
			Node currentNode = head;
			Node nextNode = head;
			int count = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return count < size;//enextNode.next!=null;
			}

			@SuppressWarnings("unchecked")
			@Override
			public E next() {
				count++;

				currentNode = nextNode;
				nextNode = currentNode.next;
				
				return (E) currentNode.value;
			}
		};
		return it;
	}

	private class Node<T> {

		public T value;

		public Node next;

		public Node(T value) {
			super();
			this.value = value;
		}

	}
}
