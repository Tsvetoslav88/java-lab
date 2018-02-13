package datastructures.softunit.heapspriorityqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryHeap<T extends Comparable<T>> {

    private List<T> heap;
    private int size;

    public BinaryHeap() {
        this.heap = new LinkedList();
    }

    public int size() {
        return this.heap.size();
    }

    public void insert(T element) {
    	this.heap.add(element);
        this.heapifyUp(element, this.heap.size() - 1);
    }

    private void heapifyUp(T element, int index){
    	int parentIndex = (index - 1) / 2;
    	int compare = this.heap.get(parentIndex).compareTo(this.heap.get(index));
    	
    	if(compare < 0){
    		this.swap(parentIndex, index);
    		this.heapifyUp(this.heap.get(parentIndex), parentIndex);
    	}
    }
    
    private void swap(int parent, int index){
    	T temp = this.heap.get(parent);
    	this.heap.set(parent, this.heap.get(index));
    	this.heap.set(index, temp);
    }
    
    public T peek() {
        return this.heap.get(0);
    }

    public T pull() {
        throw new UnsupportedOperationException();
    }
}
