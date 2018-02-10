package datastructures.softunit.circularqueue;

public class CircularQueue<E> {

	private int size;
	private E elements[];
	private int front;
	private int rear;

	public CircularQueue() {
		this.elements = (E[]) new Object[6];// Default size is 6
		this.front = 0;
		this.rear = 0;
	}

	public CircularQueue(int initialCapacity) {
		this.elements = (E[]) new Object[initialCapacity];
		this.front = 0;
		this.rear = 0;
	}

	public int size() {
		return this.size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	// Add a new element in a queue
	public void enqueue(E element) {
		if (this.size == elements.length) {// The Queue is full
			throw new IllegalArgumentException("The Circular Queue is full");
		}

		if (this.rear == elements.length) {// The rear pointer is at the end of
		                                   // a queue, start from 0
			this.rear = 0;
			this.elements[this.rear] = element;
			this.rear++;
		} else {
			this.elements[this.rear] = element;
			this.rear++;

		}

		this.size++;
	}

	// Remove an element from a queue
	public E dequeue() {

		E element;
		if (this.size == 0) {// The queue is full
			throw new IllegalArgumentException("The Circular Queue is empty");
		} else if (this.size == 1) {// There is a one element in a queue. The
		                            // rear and front pointers are at from the
		                            // beginning of array
			element = this.elements[this.front];
			this.elements[this.front] = null;
			this.front = 0;
			this.rear = 0;
		} else {
			element = this.elements[this.front];
			if (this.front == elements.length) {// The front pointer is at the
			                                    // end of the Queue, start from
			                                    // the beginner
				this.elements[this.front] = null;
				this.front = 0;
			} else {
				this.elements[this.front] = null;
				this.front += 1;
			}
		}

		this.size--;

		return element;
	}

	public E[] toArray() {
		return elements;
	}

}
