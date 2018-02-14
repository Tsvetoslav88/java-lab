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
        
    	if(this.size() == 0){
    		throw new  IllegalArgumentException();
    	}
    	
        T element = this.heap.get(0);
    	
        //Swap first with last element
    	this.swap(0, size() - 1);

    	//Remove last element which till now it was first
    	this.heap.remove(size() - 1);
    	this.heapifyDown(element, 0);
        return element;
    }

	private void heapifyDown(T element, int index) {
		
		if(index < size()/2){
			
			//Left child
			int childIndex = (index * 2) + 1;
			
			//Check if there is a right child && rightChild > leftChild
			if(childIndex + 1 < this.size() && !isGreater(childIndex, childIndex + 1)){//if left child is smaller than right
				//rightChild = leftChild + 1 
				childIndex += 1;
			}
			
			//Compare currentElement with bigger child element
			int compare = this.heap.get(index).compareTo(this.heap.get(childIndex));
			if(compare < 0){
				swap(index, childIndex);
				this.heapifyDown(this.heap.get(childIndex), childIndex);
			}
		}
		
	}
	
	private boolean isGreater(int firstIndex, int secondIndex){
		return this.heap.get(firstIndex).compareTo(this.heap.get(secondIndex)) > 0;
	}
}
