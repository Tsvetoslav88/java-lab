package datastructures.softunit.circularqueue;

public class CircularQueue<E> {

    private int size;
    private E elements[];
    private int count;
    private int front;
    private int rear;

    public CircularQueue() {
        this.elements = (E[]) new Object[6];
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

    private  void setSize(int size) {
        this.size = size;
    }

    public void enqueue(E element) {
    	if(this.size == elements.length){
    		throw new UnsupportedOperationException("The Circular Queue is full");
    	}
    	
    	this.elements[this.rear]=element;
    	if(this.rear == elements.length){
    		this.rear = 0;
    	}else{
    		this.rear++;
    	}
    	
    	this.size++;
    }

    public E dequeue() {
        // TODO
        throw new UnsupportedOperationException();
    }

    public E[] toArray() {
        // TODO
        throw new UnsupportedOperationException();
    }

}
